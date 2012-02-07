package de.fzi.continuouscloudmigration.experiments;
import java.util.LinkedList;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.rule.Rule;
import net.sourceforge.jFuzzyLogic.rule.RuleExpression;
import net.sourceforge.jFuzzyLogic.rule.RuleTerm;

public class FuzzyLogicTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "metrics.fcl";
		FIS fis = FIS.load(fileName);
		
		if (fis == null)
		{
			System.err.println("Error while reading " + fileName);
			return;
		}
		
		fis.chart();
		
		fis.setVariable("cpu", 85);
		fis.setVariable("ram", 30);
		fis.setVariable("disk", 50);
		fis.setVariable("responseTime", 2);
		fis.setVariable("networkLatency", 2);
		
		fis.evaluate();
		
		fis.getVariable("serverLoad").getLatestDefuzzifiedValue();
		
		fis.getVariable("serverLoad").chartDefuzzifier(true);
		
		fis.getVariable("networkLoad").getLatestDefuzzifiedValue();
		fis.getVariable("networkLoad").chartDefuzzifier(true);
		
	}

}
