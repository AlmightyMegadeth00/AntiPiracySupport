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

import android.app.PackageDeleteObserver;
import android.content.pm.IPackageDeleteObserver;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;

import java.lang.reflect.Method;

import static org.antipiracy.support.utils.AntiPiracyConstants.*;

/** This service blocks the install of known piracy/malware apps. Please report new piracy
 * apps to ROM developers deploying this code.
 * @author github.com/AlmightyMegadeth00 - activethrasher00@gmail.com
 */
public class AntiPiracyUtils {
    static final String TAG = "ANTI-PIRACY: Utilities";

    private static PackageDeleteObserver sPDO;

    private AntiPiracyUtils() {
        sPDO = getPackageDeleteObserver();
    }

    private static Class<?>[] UNINSTALLTYPES = new Class[] {
        String.class, IPackageDeleteObserver.class, int.class
    };

    public static class PackageDeleteObserver extends IPackageDeleteObserver.Stub {
        public void packageDeleted(String packageName, int returnCode) throws RemoteException {
            if (DEBUG) Log.i(TAG, "PackageDeleteObserver: " + packageName + " removed");
        }
    }

    public static PackageDeleteObserver getPackageDeleteObserver() {
        if (sPDO == null) sPDO = new PackageDeleteObserver();
        return sPDO;
    }

    public static Method getUninstallTypes(PackageManager pm) throws NoSuchMethodException {
        try {
            return pm.getClass().getMethod("deletePackage", UNINSTALLTYPES);
        } catch (NoSuchMethodException WTF) {
            Log.e(TAG, "NoSuchMethodException" + WTF);
        }
        return null;
    }
}
