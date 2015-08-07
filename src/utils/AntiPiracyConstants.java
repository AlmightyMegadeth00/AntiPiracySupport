/*
 * Copyright (C) 2015 The Android Open Source Project
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

package org.antipiracy.support.utils;

/** A constants class list for known piracy apps. Please report new piracy
 * apps to ROM developers deploying this code.
 * @author github.com/AlmightyMegadeth00 - activethrasher00@gmail.com
 */
public class AntiPiracyConstants {
    public static final boolean DEBUG = false;

    public static final String[] PACKAGES = {
        // Package names                                       // App names
        "com.dimonvideo.luckypatcher",                         // Lucky patcher
        "com.chelpus.lackypatch",                              // Another lucky patcher
        "com.blackmartalpha",                                  // Black Mart alpha
        "org.blackmart.market",                                // Black Mart
        "com.android.vending.billing.InAppBillingService.LUCK",// Lucky patcher 5.6.8
        "cc.madkite.freedom",                                  // Freedom
        "com.allinone.free",                                   // All-in-one Downloader
        "com.repodroid.app",                                   // Get Apk Market
        "org.creeplays.hack",                                  // CreeHack
        "com.baseappfull.fwd",                                 // Game Hacker
        "com.zmapp",                                           // Z market
        "com.dv.marketmod.installer"                           // Hacked play store that gives refunds without uninstalling the apk
    };
}
