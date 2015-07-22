LOCAL_PATH:= $(call my-dir)

include $(CLEAR_VARS)

LOCAL_STATIC_JAVA_LIBRARIES :=

LOCAL_SRC_FILES := $(call all-java-files-under, src/utils)

LOCAL_MODULE_TAGS := optional
LOCAL_PROGUARD_FLAG_FILES := proguard.flags

LOCAL_MODULE := org.antipiracy.support.utils

include $(BUILD_JAVA_LIBRARY)

