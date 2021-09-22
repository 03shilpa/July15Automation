package com.sgtesting.test;

import org.apache.log4j.Logger;

public class ForLoggerDemo 
{
		public static Logger log=Logger.getLogger("loop output");
		public static void main(String[] args)
		{
			log.info("for loop output starts here");
			for(int i=20;i<=40;i++)
			{
				if(i%2==0)
				{
					log.info("the even no "+i);
				}
			}
			log.info("for loop output ends here");

	}

}
