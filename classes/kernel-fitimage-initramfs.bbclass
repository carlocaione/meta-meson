inherit kernel-fitimage

kernel_do_deploy_append() {
	ln -snf fitImage-${INITRAMFS_IMAGE_NAME}-${KERNEL_FIT_NAME}.bin ${DEPLOYDIR}/fitImage.initramfs
}
