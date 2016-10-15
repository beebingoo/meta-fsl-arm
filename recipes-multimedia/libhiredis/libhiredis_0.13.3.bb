SUMMARY = "libhiredis"
SECTION = "lib"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=d84d659a35c666d23233e54503aaea51"

# 0.13.3
# SRCREV = "010756025e8cefd1bc66c6d4ed3b1648ef6f1f95"
SRC_URI = "git://github.com/redis/hiredis.git;rev=v0.13.3"

S = "${WORKDIR}/git/"

# error handleing
# @PREFIX: set the path from /usr/local to /usr/
# @INSTALL: set the copy instruction from "cp -a" to "cp -r"
EXTRA_OEMAKE = "'PREFIX=${prefix}' 'INSTALL=''cp -r'''"

do_compile() {
    oe_runmake all 'CC=${CC}'
}

do_install() {
    oe_runmake install 'DESTDIR=${D}'
}
