DESCRIPTION = "A SD/MMC Image for Amlogic Meson SoCs with RAUC support"

IMAGE_FEATURES += "ssh-server-openssh package-management"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    packagegroup-core-ssh-openssh \
    kernel-image \
    kernel-modules \
    kernel-devicetree \
    linux-firmware \
    opkg \
    opkg-collateral \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    rauc \
    "

# 1G Rootfs
IMAGE_ROOTFS_SIZE = "1048576"

IMAGE_FSTYPES = "wic ext4"

inherit core-image
