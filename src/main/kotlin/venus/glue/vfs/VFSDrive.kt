package venus.glue.vfs

class VFSDrive(val n: String, override var parent: VFSObject) : VFSFolder(n, parent) {
    override val type = VFSType.Drive
    init {
        //
    }
}