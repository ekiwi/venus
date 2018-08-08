package venus.riscv.insts.floating.single.r

import venus.riscv.insts.dsl.floating.FR4TypeInstruction
import venus.riscv.insts.floating.Decimal

val fnsubs = FR4TypeInstruction(
        name = "fnmsub.s",
        opcode = 0b1001011,
        funct2 = 0b00,
        eval32 = { a, b, c -> Decimal(f = -((a.getFloat() * b.getFloat()) - c.getFloat())) }
)