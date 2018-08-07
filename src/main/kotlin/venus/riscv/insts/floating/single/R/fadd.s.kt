package venus.riscv.insts.floating.single.r

import venus.riscv.insts.dsl.floating.FSRTypeInstruction

/*Single-Precision*/
val fadds = FSRTypeInstruction(
        name = "fadd.s",
        opcode = 0b1010011,
        funct7 = 0b0000000,
        eval32 = { a, b -> a + b }
)