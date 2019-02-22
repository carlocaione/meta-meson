DESCRIPTION = "FIT image recipe"

IMAGE_INSTALL = ""
PACKAGE_INSTALL = ""
IMAGE_LINGUAS = ""
IMAGE_FEATURES = ""

inherit image

deploy_fit() {
	D_DIR=${@d.getVar('DEPLOY_DIR_IMAGE')}
	install -D -m 0644 ${D_DIR}/fitImage.initramfs ${IMAGE_ROOTFS}/fitImage
}
ROOTFS_POSTPROCESS_COMMAND_append = " deploy_fit; "

remove_dirs() {
	rm -rf ${IMAGE_ROOTFS}/etc
	rm -rf ${IMAGE_ROOTFS}/var
}
IMAGE_PREPROCESS_COMMAND_append = " remove_dirs; "

do_rootfs[depends] += "amlogic-image-rauc:do_image_complete"
