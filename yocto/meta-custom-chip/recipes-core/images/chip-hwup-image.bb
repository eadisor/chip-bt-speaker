include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += "\
    rtk-hciattach \
    dropbear \
    dbus \
    bluez5 \
    pulseaudio \
    rtl8723bs \
    alsa-utils \
    wireless-tools \
    wpa-supplicant \
    alsa-utils-aconnect \
    alsa-utils-alsaloop \
    alsa-utils-alsamixer \
    alsa-utils-alsaucm \
    alsa-utils-amixer \
    alsa-utils-aplay \
    alsa-utils-aseqdump \
    alsa-utils-aseqnet \
    alsa-utils-iecset \
    alsa-utils-midi \
    alsa-utils-speakertest \
    bluez5 \
    bluez5-obex \
    dbus-lib \
    gmp \
    gnutls \
    json-c \
    sbc \
    shadow-base \
    speexdsp \
    sysvinit \
    libasound \
    libffi \
    libgcrypt \
    libgpg-error \
    libice \
    libkmod \
    libltdl \
    libnl \
    libnl-cli \
    libnl-genl \
    libnl-nf \
    libnl-route \
    libpulse \
    libpulsecommon \
    libpulsecore \
    libpulse-mainloop-glib \
    libpulse-simple \
    libsamplerate0 \
    libsm \
    libsndfile1 \
    libtool \
    libx11 \
    libx11-xcb \
    libxau \
    libxcb \
    libxdmcp \
    libxext \
    libxi \
    libxtst \
    ncurses-libformw \
    ncurses-libmenuw \
    ncurses-libpanelw \
    nettle \
    pulseaudio-lib-alsa-util \
    pulseaudio-lib-avahi-wrap \
    pulseaudio-lib-bluez5-util \
    pulseaudio-lib-cli \
    pulseaudio-lib-oss-util \
    pulseaudio-lib-protocol-cli \
    pulseaudio-lib-protocol-esound \
    pulseaudio-lib-protocol-http \
    pulseaudio-lib-protocol-native \
    pulseaudio-lib-protocol-simple \
    pulseaudio-lib-rtp \
    pulseaudio-misc \
    pulseaudio-module-alsa-card \
    pulseaudio-module-alsa-sink \
    pulseaudio-module-alsa-source \
    pulseaudio-module-always-sink \
    pulseaudio-module-augment-properties \
    pulseaudio-module-bluetooth-discover \
    pulseaudio-module-bluetooth-policy \
    pulseaudio-module-bluez5-device \
    pulseaudio-module-bluez5-discover \
    pulseaudio-module-card-restore \
    pulseaudio-module-cli \
    pulseaudio-module-cli-protocol-tcp \
    pulseaudio-module-cli-protocol-unix \
    pulseaudio-module-combine \
    pulseaudio-module-combine-sink \
    pulseaudio-module-console-kit \
    pulseaudio-module-dbus-protocol \
    pulseaudio-module-default-device-restore \
    pulseaudio-module-detect \
    pulseaudio-module-device-manager \
    pulseaudio-module-device-restore \
    pulseaudio-module-echo-cancel \
    pulseaudio-module-esound-compat-spawnfd \
    pulseaudio-module-esound-compat-spawnpid \
    pulseaudio-module-esound-protocol-tcp \
    pulseaudio-module-esound-protocol-unix \
    pulseaudio-module-esound-sink \
    pulseaudio-module-filter-apply \
    pulseaudio-module-filter-heuristics \
    pulseaudio-module-gconf \
    pulseaudio-module-http-protocol-tcp \
    pulseaudio-module-http-protocol-unix \
    pulseaudio-module-intended-roles \
    pulseaudio-module-ladspa-sink \
    pulseaudio-module-loopback \
    pulseaudio-module-match \
    pulseaudio-module-mmkbd-evdev \
    pulseaudio-module-native-protocol-fd \
    pulseaudio-module-native-protocol-tcp \
    pulseaudio-module-native-protocol-unix \
    pulseaudio-module-null-sink \
    pulseaudio-module-null-source \
    pulseaudio-module-oss \
    pulseaudio-module-pipe-sink \
    pulseaudio-module-pipe-source \
    pulseaudio-module-position-event-sounds \
    pulseaudio-module-remap-sink \
    pulseaudio-module-remap-source \
    pulseaudio-module-rescue-streams \
    pulseaudio-module-role-cork \
    pulseaudio-module-role-ducking \
    pulseaudio-module-rtp-recv \
    pulseaudio-module-rtp-send \
    pulseaudio-module-rygel-media-server \
    pulseaudio-module-simple-protocol-tcp \
    pulseaudio-module-simple-protocol-unix \
    pulseaudio-module-sine \
    pulseaudio-module-sine-source \
    pulseaudio-module-stream-restore \
    pulseaudio-module-suspend-on-idle \
    pulseaudio-module-switch-on-connect \
    pulseaudio-module-switch-on-port-available \
    pulseaudio-module-tunnel-sink \
    pulseaudio-module-tunnel-sink-new \
    pulseaudio-module-tunnel-source \
    pulseaudio-module-tunnel-source-new \
    pulseaudio-module-udev-detect \
    pulseaudio-module-virtual-sink \
    pulseaudio-module-virtual-source \
    pulseaudio-module-virtual-surround-sink \
    pulseaudio-module-volume-restore \
    pulseaudio-module-x11-bell \
    pulseaudio-module-x11-cork-request \
    pulseaudio-module-x11-publish \
    pulseaudio-module-x11-xsmp \
    pulseaudio-module-zeroconf-discover \
    pulseaudio-module-zeroconf-publish \
    pulseaudio-server \
    wpa-supplicant-passphrase \
    \
    kernel-modules\
"
