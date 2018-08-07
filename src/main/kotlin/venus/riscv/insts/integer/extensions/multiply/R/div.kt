package venus.riscv.insts.integer.extensions.multiply.r

import venus.riscv.insts.dsl.RTypeInstruction

val div = RTypeInstruction(
        name = "div",
        opcode = 0b0110011,
        funct3 = 0b100,
        funct7 = 0b0000001,
        eval16 = { a, b ->
            if (b == 0.toShort()) -1
            else if (a == Short.MIN_VALUE && b == (-1).toShort()) a
            else (a / b).toShort()
        },
        eval32 = { a, b ->
            if (b == 0) -1
            else if (a == Int.MIN_VALUE && b == -1) a
            else a / b
        },
        eval64 = { a, b ->
            if (b == 0.toLong()) -1
            else if (a == Long.MIN_VALUE && b == (-1).toLong()) a
            else a / b
        },
        eval128 = { a, b ->
            if (b == 0.toLong()) -1
            else if (a == Long.MIN_VALUE && b == (-1).toLong()) a
            else a / b
        }
)
