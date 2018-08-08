package venus.riscv.insts.floating.single.r

import venus.riscv.insts.dsl.floating.RtFTypeInstruction
import venus.riscv.insts.floating.Decimal

/*Single-Precision*/

val fmvsx = RtFTypeInstruction(
        name = "fmv.s.x",
        opcode = 0b1010011,
        funct7 = 0b1111000,
        funct3 = 0b000,
        rs2 = 0b00000,
        eval32 = { a -> Decimal(f = Float.fromBits(a)) }
)