package com.command.pattern;

/**
 * 
 * 文件名称：Engineer
 * 创建人：      junly
 * 修改人 ：      junly
 * 创建日期时间：2015年5月14日 下午2:31:09
 * 备注:
 * @version 1.0.0
 * 
 */
public class Engineer implements Command {

	@Override
	public void execute() {
         System.out.println("Engineer  Develop");
	}

}
