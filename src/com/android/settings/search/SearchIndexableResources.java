/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.search;

import android.provider.SearchIndexableResource;

import com.android.settings.ButtonSettings;
import com.android.settings.DataUsageSummary;
import com.android.settings.DateTimeSettings;
import com.android.settings.DevelopmentSettings;
import com.android.settings.DeviceInfoSettings;
import com.android.settings.DisplaySettings;
import com.android.settings.HomeSettings;
import com.android.settings.ScreenPinningSettings;
import com.android.settings.PrivacySettings;
import com.android.settings.R;
import com.android.settings.SecuritySettings;
import com.android.settings.WirelessSettings;
import com.android.settings.accessibility.AccessibilitySettings;
import com.android.settings.bluetooth.BluetoothSettings;
import com.android.settings.razer.AnimationSettings;
import com.android.settings.razer.BatteryStyle;
import com.android.settings.razer.RazerDisplaySettings;
import com.android.settings.razer.InterfaceSettings;
import com.android.settings.razer.LockScreenSettings;
import com.android.settings.razer.NavbarSettings;
import com.android.settings.razer.NavigationSettings;
import com.android.settings.razer.RazerSoundSettings;
import com.android.settings.razer.SmartControl;
import com.android.settings.razer.StatusBarClockStyle;
import com.android.settings.razer.StatusBarBatteryStatusSettings;
import com.android.settings.razer.RecentsSettings;
import com.android.settings.cyanogenmod.NotificationDrawerSettings;
import com.android.settings.cyanogenmod.StatusBarSettings;
import com.android.settings.deviceinfo.Memory;
import com.android.settings.deviceinfo.UsbSettings;
import com.android.settings.fuelgauge.PowerUsageSummary;
import com.android.settings.inputmethod.InputMethodAndLanguageSettings;
import com.android.settings.location.LocationSettings;
import com.android.settings.net.DataUsageMeteredSettings;
import com.android.settings.notification.NotificationManagerSettings;
import com.android.settings.SoundSettings;
import com.android.settings.notification.OtherSoundSettings;
import com.android.settings.notification.ZenModeSettings;
import com.android.settings.print.PrintSettingsFragment;
import com.android.settings.sim.SimSettings;
import com.android.settings.razer.AmbientSettings;
import com.android.settings.users.UserSettings;
import com.android.settings.voice.VoiceInputSettings;
import com.android.settings.wifi.AdvancedWifiSettings;
import com.android.settings.wifi.SavedAccessPointsWifiSettings;
import com.android.settings.wifi.WifiSettings;

import java.util.Collection;
import java.util.HashMap;

public final class SearchIndexableResources {

    public static int NO_DATA_RES_ID = 0;

    private static HashMap<String, SearchIndexableResource> sResMap =
            new HashMap<String, SearchIndexableResource>();

    static {
        sResMap.put(WifiSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(WifiSettings.class.getName()),
                        NO_DATA_RES_ID,
                        WifiSettings.class.getName(),
                        R.drawable.ic_settings_wireless));

        sResMap.put(AdvancedWifiSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(AdvancedWifiSettings.class.getName()),
                        R.xml.wifi_advanced_settings,
                        AdvancedWifiSettings.class.getName(),
                        R.drawable.ic_settings_wireless));

        sResMap.put(SavedAccessPointsWifiSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(SavedAccessPointsWifiSettings.class.getName()),
                        R.xml.wifi_display_saved_access_points,
                        SavedAccessPointsWifiSettings.class.getName(),
                        R.drawable.ic_settings_wireless));

        sResMap.put(BluetoothSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(BluetoothSettings.class.getName()),
                        NO_DATA_RES_ID,
                        BluetoothSettings.class.getName(),
                        R.drawable.ic_settings_bluetooth2));

        sResMap.put(SimSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(SimSettings.class.getName()),
                        NO_DATA_RES_ID,
                        SimSettings.class.getName(),
                        R.drawable.ic_sim_sd));

        sResMap.put(DataUsageSummary.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(DataUsageSummary.class.getName()),
                        NO_DATA_RES_ID,
                        DataUsageSummary.class.getName(),
                        R.drawable.ic_settings_data_usage));

        sResMap.put(DataUsageMeteredSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(DataUsageMeteredSettings.class.getName()),
                        NO_DATA_RES_ID,
                        DataUsageMeteredSettings.class.getName(),
                        R.drawable.ic_settings_data_usage));

        sResMap.put(WirelessSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(WirelessSettings.class.getName()),
                        NO_DATA_RES_ID,
                        WirelessSettings.class.getName(),
                        R.drawable.ic_settings_more));

        sResMap.put(LockScreenSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(LockScreenSettings.class.getName()),
                        R.xml.razer_lockscreen_settings,
                        LockScreenSettings.class.getName(),
                        R.drawable.ic_razer_interface));

        sResMap.put(HomeSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(HomeSettings.class.getName()),
                        NO_DATA_RES_ID,
                        HomeSettings.class.getName(),
                        R.drawable.ic_settings_home));

        sResMap.put(DisplaySettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(DisplaySettings.class.getName()),
                        NO_DATA_RES_ID,
                        DisplaySettings.class.getName(),
                        R.drawable.ic_settings_display));

        sResMap.put(SoundSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(SoundSettings.class.getName()),
                        NO_DATA_RES_ID,
                        SoundSettings.class.getName(),
                        R.drawable.ic_settings_notifications));

        sResMap.put(NotificationManagerSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(NotificationManagerSettings.class.getName()),
                        NO_DATA_RES_ID,
                        NotificationManagerSettings.class.getName(),
                        R.drawable.ic_settings_notifications));

        sResMap.put(OtherSoundSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(OtherSoundSettings.class.getName()),
                        NO_DATA_RES_ID,
                        OtherSoundSettings.class.getName(),
                        R.drawable.ic_settings_notifications));

        sResMap.put(ZenModeSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(ZenModeSettings.class.getName()),
                        R.xml.zen_mode_settings,
                        ZenModeSettings.class.getName(),
                        R.drawable.ic_settings_notifications));

        sResMap.put(Memory.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(Memory.class.getName()),
                        NO_DATA_RES_ID,
                        Memory.class.getName(),
                        R.drawable.ic_settings_storage));

        sResMap.put(UsbSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(UsbSettings.class.getName()),
                        R.xml.usb_settings,
                        UsbSettings.class.getName(),
                        R.drawable.ic_settings_storage));

        sResMap.put(PowerUsageSummary.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(PowerUsageSummary.class.getName()),
                        R.xml.power_usage_summary,
                        PowerUsageSummary.class.getName(),
                        R.drawable.ic_settings_battery));

        sResMap.put(UserSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(UserSettings.class.getName()),
                        NO_DATA_RES_ID,
                        UserSettings.class.getName(),
                        R.drawable.ic_settings_multiuser));

        sResMap.put(LocationSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(LocationSettings.class.getName()),
                        R.xml.location_settings,
                        LocationSettings.class.getName(),
                        R.drawable.ic_settings_location));

        sResMap.put(SecuritySettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(SecuritySettings.class.getName()),
                        NO_DATA_RES_ID,
                        SecuritySettings.class.getName(),
                        R.drawable.ic_settings_security));

        sResMap.put(ScreenPinningSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(ScreenPinningSettings.class.getName()),
                        NO_DATA_RES_ID,
                        ScreenPinningSettings.class.getName(),
                        R.drawable.ic_settings_security));

        sResMap.put(InputMethodAndLanguageSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(InputMethodAndLanguageSettings.class.getName()),
                        NO_DATA_RES_ID,
                        InputMethodAndLanguageSettings.class.getName(),
                        R.drawable.ic_settings_language));

        sResMap.put(VoiceInputSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(VoiceInputSettings.class.getName()),
                        NO_DATA_RES_ID,
                        VoiceInputSettings.class.getName(),
                        R.drawable.ic_settings_language));

        sResMap.put(PrivacySettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(PrivacySettings.class.getName()),
                        NO_DATA_RES_ID,
                        PrivacySettings.class.getName(),
                        R.drawable.ic_settings_backup));

        sResMap.put(DateTimeSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(DateTimeSettings.class.getName()),
                        R.xml.date_time_prefs,
                        DateTimeSettings.class.getName(),
                        R.drawable.ic_settings_date_time));

        sResMap.put(AccessibilitySettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(AccessibilitySettings.class.getName()),
                        NO_DATA_RES_ID,
                        AccessibilitySettings.class.getName(),
                        R.drawable.ic_settings_accessibility));

        sResMap.put(PrintSettingsFragment.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(PrintSettingsFragment.class.getName()),
                        NO_DATA_RES_ID,
                        PrintSettingsFragment.class.getName(),
                        R.drawable.ic_settings_print));

        sResMap.put(DevelopmentSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(DevelopmentSettings.class.getName()),
                        NO_DATA_RES_ID,
                        DevelopmentSettings.class.getName(),
                        R.drawable.ic_settings_development));

        sResMap.put(DeviceInfoSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(DeviceInfoSettings.class.getName()),
                        NO_DATA_RES_ID,
                        DeviceInfoSettings.class.getName(),
                        R.drawable.ic_settings_about));

        sResMap.put(ButtonSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(ButtonSettings.class.getName()),
                        NO_DATA_RES_ID,
                        ButtonSettings.class.getName(),
                        R.drawable.ic_settings_buttons));

        sResMap.put(StatusBarSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(StatusBarSettings.class.getName()),
                        R.xml.status_bar_settings,
                        StatusBarSettings.class.getName(),
                        R.drawable.ic_settings_extdesk_hidenavbar));

        sResMap.put(NotificationDrawerSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(NotificationDrawerSettings.class.getName()),
                        R.xml.notification_drawer_settings,
                        NotificationDrawerSettings.class.getName(),
                        R.drawable.ic_settings_notification_drawer));

        sResMap.put(com.android.settings.cyanogenmod.PrivacySettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(
                                com.android.settings.cyanogenmod.PrivacySettings.class.getName()),
                        NO_DATA_RES_ID,
                        com.android.settings.cyanogenmod.PrivacySettings.class.getName(),
                        R.drawable.ic_settings_privacy));

        sResMap.put(AmbientSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(AmbientSettings.class.getName()),
                        NO_DATA_RES_ID,
                        AmbientSettings.class.getName(),
                        R.drawable.ic_settings_display));

        sResMap.put(RecentsSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(RecentsSettings.class.getName()),
                        R.xml.recents_settings,
                        RecentsSettings.class.getName(),
                        R.drawable.ic_razer_interface));

        sResMap.put(NavbarSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(NavbarSettings.class.getName()),
                        R.xml.navbar_settings,
                        NavbarSettings.class.getName(),
                        R.drawable.ic_razer_interface));

        sResMap.put(StatusBarClockStyle.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(StatusBarClockStyle.class.getName()),
                        R.xml.status_bar_clock_style,
                        StatusBarClockStyle.class.getName(),
                        R.drawable.ic_razer_interface));

        sResMap.put(StatusBarBatteryStatusSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(StatusBarBatteryStatusSettings.class.getName()),
                        R.xml.status_bar_battery_status_settings,
                        StatusBarBatteryStatusSettings.class.getName(),
                        R.drawable.ic_razer_interface));

        sResMap.put(RazerDisplaySettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(RazerDisplaySettings.class.getName()),
                        R.xml.razer_display_settings,
                        RazerDisplaySettings.class.getName(),
                        R.drawable.ic_razer_interface));

        sResMap.put(BatteryStyle.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(BatteryStyle.class.getName()),
                        R.xml.razer_battery_style,
                        BatteryStyle.class.getName(),
                        R.drawable.ic_razer_interface));

        sResMap.put(RazerSoundSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(RazerSoundSettings.class.getName()),
                        R.xml.razer_sound_settings,
                        RazerSoundSettings.class.getName(),
                        R.drawable.ic_razer_interface));

        sResMap.put(NavigationSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(NavigationSettings.class.getName()),
                        R.xml.razer_navigation_settings,
                        NavigationSettings.class.getName(),
                        R.drawable.ic_razer_interface));

        sResMap.put(InterfaceSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(InterfaceSettings.class.getName()),
                        R.xml.razer_interface_settings,
                        InterfaceSettings.class.getName(),
                        R.drawable.ic_razer_interface));

        sResMap.put(AnimationSettings.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(AnimationSettings.class.getName()),
                        R.xml.animation_settings,
                        AnimationSettings.class.getName(),
                        R.drawable.ic_razer_interface));

        sResMap.put(SmartControl.class.getName(),
                new SearchIndexableResource(
                        Ranking.getRankForClassName(SmartControl.class.getName()),
                        R.xml.razer_smartcontrol,
                        SmartControl.class.getName(),
                        R.drawable.ic_settings_smartcontrol));
    }

    private SearchIndexableResources() {
    }

    public static int size() {
        return sResMap.size();
    }

    public static SearchIndexableResource getResourceByName(String className) {
        return sResMap.get(className);
    }

    public static Collection<SearchIndexableResource> values() {
        return sResMap.values();
    }
}
