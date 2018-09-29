package venus.glue.terminal.cmds

import venus.glue.terminal.Command
import venus.glue.terminal.Terminal

var cat = Command(
        name = "cat",
        execute = fun (args: MutableList<String>, t: Terminal): String {
            return t.vfs.cat(args.joinToString(" "))
        }
)