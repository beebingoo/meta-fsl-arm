DESCRIPTION = "A console-only image that includes gstreamer packages, \
Freescale's multimedia packages (VPU and GPU) when available, and \
test and benchmark applications."

LICENSE = "MIT"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL += " \
    connman-client \
    ethtool \
    lighttpd \
    iptables \
    php php-cli \
    php-cgi \
    net-snmp-server redis \
    libmodbus libhiredis libevent \
    libssh2 \
    packagegroup-core-ssh-dropbear \
    socat \
    ser2net \
    tcpdump \
"
