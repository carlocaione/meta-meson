DESCRIPTION = "A initrd Image for Amlogic Meson SoCs with RAUC support"

IMAGE_FEATURES = ""

PACKAGE_INSTALL = "\
    packagegroup-core-boot \
    kernel-modules \
    ${ROOTFS_BOOTSTRAP_INSTALL} \
    "

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"

inherit core-image
