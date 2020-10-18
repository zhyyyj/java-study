package com.yjzh.java.week3.cpu;

/**
 * @ClassName Test
 * @Description TODO
 * @Author WL
 * @Date 2020/10/14
 **/
public class Test {
    public static void main(String[] args) {
        Cpu cpu = new Cpu();
        cpu.getSpeed(2200);
        HardDisk disk = new HardDisk();
        disk.setAmount(200);
        Pc pc = new Pc();
        pc.setCPU(cpu);
        pc.setHardDisk(disk);
        pc.show();

    }
}
