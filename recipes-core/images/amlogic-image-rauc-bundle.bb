inherit bundle

RAUC_BUNDLE_SLOTS = "rootfs appfs"

RAUC_SLOT_rootfs = "amlogic-image-rauc"
RAUC_SLOT_appfs = "amlogic-image-rauc-fit"

RAUC_SLOT_rootfs[fstype] = "ext4"
RAUC_SLOT_appfs[fstype] = "ext4"
