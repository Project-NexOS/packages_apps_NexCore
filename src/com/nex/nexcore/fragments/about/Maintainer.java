/*
 * Copyright (C) 2019-2024 The Evolution X Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nex.nexcore.fragments.about;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.preference.Preference;
import androidx.preference.Preference.OnPreferenceChangeListener;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;

import com.android.internal.logging.nano.MetricsProto.MetricsEvent;
import com.android.settings.R;
import com.android.settings.search.BaseSearchIndexProvider;
import com.android.settings.SettingsPreferenceFragment;
import com.android.settingslib.search.SearchIndexable;

import java.util.List;

@SearchIndexable
public class Maintainer extends SettingsPreferenceFragment implements
        Preference.OnPreferenceChangeListener {

    private static final String TAG = "Maintainer";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.nex_settings_maintainer);

        final Context context = getContext();
        final ContentResolver resolver = context.getContentResolver();
        final PreferenceScreen prefScreen = getPreferenceScreen();
        final Resources resources = context.getResources();
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        final Context context = getContext();
        final ContentResolver resolver = context.getContentResolver();
        return false;
    }

    @Override
    public int getMetricsCategory() {
        return MetricsEvent.CUSTOM;
    }

    public static final BaseSearchIndexProvider SEARCH_INDEX_DATA_PROVIDER =
        new BaseSearchIndexProvider(R.xml.nex_settings_maintainer) {

            @Override
            public List<String> getNonIndexableKeys(Context context) {
                List<String> keys = super.getNonIndexableKeys(context);
                final Resources resources = context.getResources();
                return keys;
            }
        };
}