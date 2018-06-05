package com.mybatis.test;

import org.mybatis.generator.api.ShellRunner;

public class Test01 {
	public static void main(String[] args) {
        args = new String[] { "-configfile", "src\\main\\resources\\mybatis-generator-config.xml", "-overwrite" };
        ShellRunner.main(args);
    }
}
