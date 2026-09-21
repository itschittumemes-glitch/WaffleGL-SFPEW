MGLegacy - FCL renderer plugin project

1. Put ALL your .so files in:  app/src/main/jniLibs/arm64-v8a/
   (libSimpleFPEWrapper.so, libmobileglues.so, libEGL_angle.so, libGLESv2_angle.so if you have it,
    libglapi.so, libandroidnsbypass.so)
2. Push to GitHub (keep the repo PRIVATE).
3. Open the Actions tab, wait for the green tick, download the artifact "MGLegacy-apk".
4. Unzip it, install the .apk, pick "MGLegacy" in FCL's renderer list.
