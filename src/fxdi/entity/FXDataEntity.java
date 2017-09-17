package fxdi.entity;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;

import fxdi.utils.CodeConstants;
import fxdi.utils.UtilMethods;

public class FXDataEntity {

	private String ashi;
	
	private String currencyPair;
	
	private Date date;
	
	private String yobi;
	
	private double hajimene;
	
	private double owarine;
	
	private double takane;
	
	private double yasune;
	
	private double sma21;
	
	private double sma55;

	private double sma89;
	
	private double span9;
	
	private double span52;
	
	private double spanDelayLine12;

	private double dmiDPlus14;

	private double dmiDMinus14;

	private double dmiAdx14;

	private double dmiAdxr14;

	private double stochasticsK9;

	private double stochasticsD3;
	
	private double stochasticsSlowD3;
	
	private double ema5;
	
	private double ema12;

	private double ema26;
	
	private double parabolicBuy;

	private double parabolicSell;

	private double envelopeStandard21;
	
	private double envelopeDivergence2Bottom;

	private double envelopeDivergence2Top;

	private double envelopeDivergence3Bottom;

	private double envelopeDivergence3Top;

	private double gmmaS1with3;

	private double gmmaS2with5;

	private double gmmaS3with8;

	private double gmmaS4with10;

	private double gmmaS5with12;

	private double gmmaS6with15;

	private double gmmaL1with30;

	private double gmmaL2with35;

	private double gmmaL3with40;

	private double gmmaL4with45;

	private double gmmaL5with50;
	
	private double gmmaL6with60;

	private double gmmaTP21;
	
	private double sBollingerDelayLine21;
	
	private double sBollingerPlus1Sigma;
	
	private double sBollingerPlus2Sigma;
	
	private double sBollingerPlus3Sigma;
	
	private double sBollingerMinus1Sigma;
	
	private double sBollingerMinus2Sigma;
	
	private double sBollingerMinus3Sigma;

	private double hlBandh20;

	private double hlBandl20;

	private double hlBandCenter;

	private double macd1226;

	private double macdParalellSignal9;
	
	private double macdDivergence;

	private double AverageHajimene;

	private double AverageOwarine;

	private double AverageYasune;

	private double AverageTakane;

	public String getAshi() {
		return ashi;
	}

	public void setAshi(String ashi) {
		this.ashi = ashi;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCurrencyPair() {
		return currencyPair;
	}

	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}

	public String getYobi() {
		return yobi;
	}

	public void setYobi(String yobi) {
		this.yobi = yobi;
	}

	public double getHajimene() {
		return hajimene;
	}

	public void setHajimene(double hajimene) {
		this.hajimene = hajimene;
	}

	public double getOwarine() {
		return owarine;
	}

	public void setOwarine(double owarine) {
		this.owarine = owarine;
	}

	public double getTakane() {
		return takane;
	}

	public void setTakane(double takane) {
		this.takane = takane;
	}

	public double getYasune() {
		return yasune;
	}

	public void setYasune(double yasune) {
		this.yasune = yasune;
	}

	public double getSma21() {
		return sma21;
	}

	public void setSma21(double sma21) {
		this.sma21 = sma21;
	}

	public double getSma55() {
		return sma55;
	}

	public void setSma55(double sma55) {
		this.sma55 = sma55;
	}

	public double getSma89() {
		return sma89;
	}

	public void setSma89(double sma89) {
		this.sma89 = sma89;
	}

	public double getSpan9() {
		return span9;
	}

	public void setSpan9(double span9) {
		this.span9 = span9;
	}

	public double getSpan52() {
		return span52;
	}

	public void setSpan52(double span52) {
		this.span52 = span52;
	}

	public double getSpanDelayLine12() {
		return spanDelayLine12;
	}

	public void setSpanDelayLine12(double spanDelayLine12) {
		this.spanDelayLine12 = spanDelayLine12;
	}

	public double getDmiDPlus14() {
		return dmiDPlus14;
	}

	public void setDmiDPlus14(double dmiDPlus14) {
		this.dmiDPlus14 = dmiDPlus14;
	}

	public double getDmiDMinus14() {
		return dmiDMinus14;
	}

	public void setDmiDMinus14(double dmiDMinus14) {
		this.dmiDMinus14 = dmiDMinus14;
	}

	public double getDmiAdx14() {
		return dmiAdx14;
	}

	public void setDmiAdx14(double dmiAdx14) {
		this.dmiAdx14 = dmiAdx14;
	}

	public double getDmiAdxr14() {
		return dmiAdxr14;
	}

	public void setDmiAdxr14(double dmiAdxr14) {
		this.dmiAdxr14 = dmiAdxr14;
	}

	public double getStochasticsK9() {
		return stochasticsK9;
	}

	public void setStochasticsK9(double stochasticsK9) {
		this.stochasticsK9 = stochasticsK9;
	}

	public double getStochasticsD3() {
		return stochasticsD3;
	}

	public void setStochasticsD3(double stochasticsD3) {
		this.stochasticsD3 = stochasticsD3;
	}

	public double getStochasticsSlowD3() {
		return stochasticsSlowD3;
	}

	public void setStochasticsSlowD3(double stochasticsSlowD3) {
		this.stochasticsSlowD3 = stochasticsSlowD3;
	}

	public double getEma5() {
		return ema5;
	}

	public void setEma5(double ema5) {
		this.ema5 = ema5;
	}

	public double getEma12() {
		return ema12;
	}

	public void setEma12(double ema12) {
		this.ema12 = ema12;
	}

	public double getEma26() {
		return ema26;
	}

	public void setEma26(double ema26) {
		this.ema26 = ema26;
	}

	public double getParabolicBuy() {
		return parabolicBuy;
	}

	public void setParabolicBuy(double parabolicBuy) {
		this.parabolicBuy = parabolicBuy;
	}

	public double getParabolicSell() {
		return parabolicSell;
	}

	public void setParabolicSell(double parabolicSell) {
		this.parabolicSell = parabolicSell;
	}

	public double getEnvelopeStandard21() {
		return envelopeStandard21;
	}

	public void setEnvelopeStandard21(double envelopeStandard21) {
		this.envelopeStandard21 = envelopeStandard21;
	}

	public double getEnvelopeDivergence2Bottom() {
		return envelopeDivergence2Bottom;
	}

	public void setEnvelopeDivergence2Bottom(double envelopeDivergence2Bottom) {
		this.envelopeDivergence2Bottom = envelopeDivergence2Bottom;
	}

	public double getEnvelopeDivergence2Top() {
		return envelopeDivergence2Top;
	}

	public void setEnvelopeDivergence2Top(double envelopeDivergence2Top) {
		this.envelopeDivergence2Top = envelopeDivergence2Top;
	}

	public double getEnvelopeDivergence3Bottom() {
		return envelopeDivergence3Bottom;
	}

	public void setEnvelopeDivergence3Bottom(double envelopeDivergence3Bottom) {
		this.envelopeDivergence3Bottom = envelopeDivergence3Bottom;
	}

	public double getEnvelopeDivergence3Top() {
		return envelopeDivergence3Top;
	}

	public void setEnvelopeDivergence3Top(double envelopeDivergence3Top) {
		this.envelopeDivergence3Top = envelopeDivergence3Top;
	}

	public double getGmmaS1with3() {
		return gmmaS1with3;
	}

	public void setGmmaS1with3(double gmmaS1with3) {
		this.gmmaS1with3 = gmmaS1with3;
	}

	public double getGmmaS2with5() {
		return gmmaS2with5;
	}

	public void setGmmaS2with5(double gmmaS2with5) {
		this.gmmaS2with5 = gmmaS2with5;
	}

	public double getGmmaS3with8() {
		return gmmaS3with8;
	}

	public void setGmmaS3with8(double gmmaS3with8) {
		this.gmmaS3with8 = gmmaS3with8;
	}

	public double getGmmaS4with10() {
		return gmmaS4with10;
	}

	public void setGmmaS4with10(double gmmaS4with10) {
		this.gmmaS4with10 = gmmaS4with10;
	}

	public double getGmmaS5with12() {
		return gmmaS5with12;
	}

	public void setGmmaS5with12(double gmmaS5with12) {
		this.gmmaS5with12 = gmmaS5with12;
	}

	public double getGmmaS6with15() {
		return gmmaS6with15;
	}

	public void setGmmaS6with15(double gmmaS6with15) {
		this.gmmaS6with15 = gmmaS6with15;
	}

	public double getGmmaL1with30() {
		return gmmaL1with30;
	}

	public void setGmmaL1with30(double gmmaL1with30) {
		this.gmmaL1with30 = gmmaL1with30;
	}

	public double getGmmaL2with35() {
		return gmmaL2with35;
	}

	public void setGmmaL2with35(double gmmaL2with35) {
		this.gmmaL2with35 = gmmaL2with35;
	}

	public double getGmmaL3with40() {
		return gmmaL3with40;
	}

	public void setGmmaL3with40(double gmmaL3with40) {
		this.gmmaL3with40 = gmmaL3with40;
	}

	public double getGmmaL4with45() {
		return gmmaL4with45;
	}

	public void setGmmaL4with45(double gmmaL4with45) {
		this.gmmaL4with45 = gmmaL4with45;
	}

	public double getGmmaL5with50() {
		return gmmaL5with50;
	}

	public void setGmmaL5with50(double gmmaL5with50) {
		this.gmmaL5with50 = gmmaL5with50;
	}

	public double getGmmaL6with60() {
		return gmmaL6with60;
	}

	public void setGmmaL6with60(double gmmaL6with60) {
		this.gmmaL6with60 = gmmaL6with60;
	}

	public double getGmmaTP21() {
		return gmmaTP21;
	}

	public void setGmmaTP21(double gmmaTP21) {
		this.gmmaTP21 = gmmaTP21;
	}

	public double getsBollingerDelayLine21() {
		return sBollingerDelayLine21;
	}

	public void setsBollingerDelayLine21(double sBollingerDelayLine21) {
		this.sBollingerDelayLine21 = sBollingerDelayLine21;
	}

	public double getsBollingerPlus1Sigma() {
		return sBollingerPlus1Sigma;
	}

	public void setsBollingerPlus1Sigma(double sBollingerPlus1Sigma) {
		this.sBollingerPlus1Sigma = sBollingerPlus1Sigma;
	}

	public double getsBollingerPlus2Sigma() {
		return sBollingerPlus2Sigma;
	}

	public void setsBollingerPlus2Sigma(double sBollingerPlus2Sigma) {
		this.sBollingerPlus2Sigma = sBollingerPlus2Sigma;
	}

	public double getsBollingerPlus3Sigma() {
		return sBollingerPlus3Sigma;
	}

	public void setsBollingerPlus3Sigma(double sBollingerPlus3Sigma) {
		this.sBollingerPlus3Sigma = sBollingerPlus3Sigma;
	}

	public double getsBollingerMinus1Sigma() {
		return sBollingerMinus1Sigma;
	}

	public void setsBollingerMinus1Sigma(double sBollingerMinus1Sigma) {
		this.sBollingerMinus1Sigma = sBollingerMinus1Sigma;
	}

	public double getsBollingerMinus2Sigma() {
		return sBollingerMinus2Sigma;
	}

	public void setsBollingerMinus2Sigma(double sBollingerMinus2Sigma) {
		this.sBollingerMinus2Sigma = sBollingerMinus2Sigma;
	}

	public double getsBollingerMinus3Sigma() {
		return sBollingerMinus3Sigma;
	}

	public void setsBollingerMinus3Sigma(double sBollingerMinus3Sigma) {
		this.sBollingerMinus3Sigma = sBollingerMinus3Sigma;
	}

	public double getHlBandh20() {
		return hlBandh20;
	}

	public void setHlBandh20(double hlBandh20) {
		this.hlBandh20 = hlBandh20;
	}

	public double getHlBandl20() {
		return hlBandl20;
	}

	public void setHlBandl20(double hlBandl20) {
		this.hlBandl20 = hlBandl20;
	}

	public double getHlBandCenter() {
		return hlBandCenter;
	}

	public void setHlBandCenter(double hlBandCenter) {
		this.hlBandCenter = hlBandCenter;
	}

	public double getMacd1226() {
		return macd1226;
	}

	public void setMacd1226(double macd1226) {
		this.macd1226 = macd1226;
	}

	public double getMacdParalellSignal9() {
		return macdParalellSignal9;
	}

	public void setMacdParalellSignal9(double macdParalellSignal9) {
		this.macdParalellSignal9 = macdParalellSignal9;
	}

	public double getMacdDivergence() {
		return macdDivergence;
	}

	public void setMacdDivergence(double macdDivergence) {
		this.macdDivergence = macdDivergence;
	}

	public double getAverageHajimene() {
		return AverageHajimene;
	}

	public void setAverageHajimene(double averageHajimene) {
		AverageHajimene = averageHajimene;
	}

	public double getAverageOwarine() {
		return AverageOwarine;
	}

	public void setAverageOwarine(double averageOwarine) {
		AverageOwarine = averageOwarine;
	}

	public double getAverageYasune() {
		return AverageYasune;
	}

	public void setAverageYasune(double averageYasune) {
		AverageYasune = averageYasune;
	}

	public double getAverageTakane() {
		return AverageTakane;
	}

	public void setAverageTakane(double averageTakane) {
		AverageTakane = averageTakane;
	}
	
	public FXDataEntity(String ashi,String currencyPair) {
		this.ashi = ashi;
		this.currencyPair = currencyPair;
	}

	public void importRecordCsv1(String[] record) {

		this.date = UtilMethods.stringToDateyyyyMMddHHmm(record[0]);
		this.hajimene = Double.parseDouble(record[1]);
		this.takane = Double.parseDouble(record[2]);
		this.yasune = Double.parseDouble(record[3]);
		this.owarine = Double.parseDouble(record[4]);
		this.sma21 = Double.parseDouble(record[5]);
		this.sma55 = Double.parseDouble(record[6]);
		this.sma89 = Double.parseDouble(record[7]);
		this.span9 = Double.parseDouble(record[8]);
		this.span52 = Double.parseDouble(record[9]);
		this.spanDelayLine12 = Double.parseDouble(record[10]);
		this.stochasticsK9 = Double.parseDouble(record[11]);
		this.stochasticsD3 = Double.parseDouble(record[12]);
		this.stochasticsSlowD3 = Double.parseDouble(record[13]);
		this.dmiDPlus14 = Double.parseDouble(record[14]);
		this.dmiDMinus14 = Double.parseDouble(record[15]);
		this.dmiAdx14 = Double.parseDouble(record[16]);
		this.dmiAdxr14 = Double.parseDouble(record[17]);
		this.yobi = getYobiFromDate(date);
	}
	
	public void importRecordCsv2(String[] record) {
		this.ema5 = Double.parseDouble(record[5]);
		this.ema12 = Double.parseDouble(record[6]);
		this.ema26 = Double.parseDouble(record[7]);
		this.parabolicBuy = Double.parseDouble(record[8]);
		this.parabolicSell = Double.parseDouble(record[9]);
		this.envelopeStandard21 = Double.parseDouble(record[10]);
		this.envelopeDivergence2Bottom = Double.parseDouble(record[11]);
		this.envelopeDivergence2Top = Double.parseDouble(record[12]);
		this.envelopeDivergence3Bottom = Double.parseDouble(record[13]);
		this.envelopeDivergence3Top = Double.parseDouble(record[14]);
		this.gmmaS1with3 = Double.parseDouble(record[15]);
		this.gmmaS2with5 = Double.parseDouble(record[16]);
		this.gmmaS3with8 = Double.parseDouble(record[17]);
		this.gmmaS4with10 = Double.parseDouble(record[18]);
		this.gmmaS5with12 = Double.parseDouble(record[19]);
		this.gmmaS6with15 = Double.parseDouble(record[20]);
		this.gmmaL1with30 = Double.parseDouble(record[21]);
		this.gmmaL2with35 = Double.parseDouble(record[22]);
		this.gmmaL3with40 = Double.parseDouble(record[23]);
		this.gmmaL4with45 = Double.parseDouble(record[24]);
		this.gmmaL5with50 = Double.parseDouble(record[25]);
		this.gmmaL6with60 = Double.parseDouble(record[26]);
		this.gmmaTP21 = Double.parseDouble(record[27]);
		this.sBollingerPlus1Sigma = Double.parseDouble(record[28]);
		this.sBollingerMinus1Sigma = Double.parseDouble(record[29]);
		this.sBollingerPlus2Sigma = Double.parseDouble(record[30]);
		this.sBollingerMinus2Sigma = Double.parseDouble(record[31]);
		this.sBollingerPlus3Sigma = Double.parseDouble(record[32]);
		this.sBollingerMinus3Sigma = Double.parseDouble(record[33]);
		this.sBollingerDelayLine21 = Double.parseDouble(record[34]);
		this.hlBandh20 = Double.parseDouble(record[35]);
		this.hlBandl20 = Double.parseDouble(record[36]);
		this.hlBandCenter = Double.parseDouble(record[37]);
		this.macd1226 = Double.parseDouble(record[38]);
		this.macdParalellSignal9 = Double.parseDouble(record[39]);
		this.macdDivergence = Double.parseDouble(record[40]);
		this.AverageHajimene = Double.parseDouble(record[41]);
		this.AverageTakane = Double.parseDouble(record[42]);
		this.AverageYasune = Double.parseDouble(record[43]);
		this.AverageOwarine = Double.parseDouble(record[44]);
	}
	
	public void resultsetToEntity(ResultSet rs,String currencyPair)throws Exception {
		this.date = rs.getTimestamp("date");
		this.hajimene = rs.getDouble("hajimene");
		this.takane = rs.getDouble("takane");
		this.yasune = rs.getDouble("yasune");
		this.owarine = rs.getDouble("owarine");
		this.sma21 = rs.getDouble("sma21");
		this.sma55 = rs.getDouble("sma55");
		this.sma89 = rs.getDouble("sma89");
		this.span9 = rs.getDouble("span9");
		this.span52 = rs.getDouble("span52");
		this.spanDelayLine12 = rs.getDouble("spanDelayLine12");
		this.stochasticsK9 = rs.getDouble("stochasticsK9");
		this.stochasticsD3 = rs.getDouble("stochasticsD3");
		this.stochasticsSlowD3 = rs.getDouble("stochasticsSlowD3");
		this.dmiDPlus14 = rs.getDouble("dmiDPlus14");
		this.dmiDMinus14 = rs.getDouble("dmiDMinus14");
		this.dmiAdx14 = rs.getDouble("dmiAdx14");
		this.dmiAdxr14 = rs.getDouble("dmiAdxr14");
		this.yobi = getYobiFromDate(this.date);
		this.ema5 = rs.getDouble("ema5");
		this.ema12 = rs.getDouble("ema12");
		this.ema26 = rs.getDouble("ema26");
		this.parabolicBuy = rs.getDouble("parabolicBuy");
		this.parabolicSell = rs.getDouble("parabolicSell");
		this.envelopeStandard21 = rs.getDouble("envelopeStandard21");
		this.envelopeDivergence2Bottom = rs.getDouble("envelopeDivergence2Bottom");
		this.envelopeDivergence2Top = rs.getDouble("envelopeDivergence2Top");
		this.envelopeDivergence3Bottom = rs.getDouble("envelopeDivergence3Bottom");
		this.envelopeDivergence3Top = rs.getDouble("envelopeDivergence3Top");
		this.gmmaS1with3 = rs.getDouble("gmmaS1with3");
		this.gmmaS2with5 = rs.getDouble("gmmaS2with5");
		this.gmmaS3with8 = rs.getDouble("gmmaS3with8");
		this.gmmaS4with10 = rs.getDouble("gmmaS4with10");
		this.gmmaS5with12 = rs.getDouble("gmmaS5with12");
		this.gmmaS6with15 = rs.getDouble("gmmaS6with15");
		this.gmmaL1with30 = rs.getDouble("gmmaL1with30");
		this.gmmaL2with35 = rs.getDouble("gmmaL2with35");
		this.gmmaL3with40 = rs.getDouble("gmmaL3with40");
		this.gmmaL4with45 = rs.getDouble("gmmaL4with45");
		this.gmmaL5with50 = rs.getDouble("gmmaL5with50");
		this.gmmaL6with60 = rs.getDouble("gmmaL6with60");
		this.gmmaTP21 = rs.getDouble("gmmaTP21");
		this.sBollingerPlus1Sigma = rs.getDouble("sBollingerPlus1Sigma");
		this.sBollingerMinus1Sigma = rs.getDouble("sBollingerMinus1Sigma");
		this.sBollingerPlus2Sigma = rs.getDouble("sBollingerPlus2Sigma");
		this.sBollingerMinus2Sigma = rs.getDouble("sBollingerMinus2Sigma");
		this.sBollingerPlus3Sigma = rs.getDouble("sBollingerPlus3Sigma");
		this.sBollingerMinus3Sigma = rs.getDouble("sBollingerMinus3Sigma");
		this.sBollingerDelayLine21 = rs.getDouble("sBollingerDelayLine21");
		this.hlBandh20 = rs.getDouble("hlBandh20");
		this.hlBandl20 = rs.getDouble("hlBandl20");
		this.hlBandCenter = rs.getDouble("hlBandCenter");
		this.macd1226 = rs.getDouble("macd1226");
		this.macdParalellSignal9 = rs.getDouble("macdParalellSignal9");
		this.macdDivergence = rs.getDouble("macdDivergence");
		this.AverageHajimene = rs.getDouble("AverageHajimene");
		this.AverageTakane = rs.getDouble("AverageTakane");
		this.AverageYasune = rs.getDouble("AverageYasune");
		this.AverageOwarine = rs.getDouble("AverageOwarine");
	}
	/**
	 * Dateを受け取り、曜日を返す。
	 * @param date
	 * @return
	 */
	public String getYobiFromDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return CodeConstants.strYobi[cal.get(Calendar.DAY_OF_WEEK) - 1];
	}
	
	/**
	 * テクニカル値が0の所を新しいEntityから取った値で更新していく。
	 * @param newEntity
	 */
	public void newIntoOldEntity(FXDataEntity newEntity) {
		if(this.spanDelayLine12 == 0) {
			this.spanDelayLine12 = newEntity.getSpanDelayLine12();
		}
		if(this.sBollingerDelayLine21 == 0) {
			this.sBollingerDelayLine21 = newEntity.getsBollingerDelayLine21();
		}
		if(this.sma21 == 0) {
			this.sma21 = newEntity.getSma21();
		}
		if(this.sma55 == 0) {
			this.sma55 = newEntity.getSma55();
		}	
		if(this.sma89 == 0) {
			this.sma89 = newEntity.getSma89();
		}	
		if(this.ema5 == 0) {
			this.ema5 = newEntity.getEma5();
		}	
		if(this.ema12 == 0) {
			this.ema12 = newEntity.getEma12();
		}	
		if(this.ema26 == 0) {
			this.ema26 = newEntity.getEma26();
		}	
		if(this.span9 == 0) {
			this.span9 = newEntity.getSpan9();
		}	
		if(this.span52 == 0) {
			this.span52 = newEntity.getSpan52();
		}	
		if(this.dmiDPlus14 == 0) {
			this.dmiDPlus14 = newEntity.getDmiDPlus14();
		}	
		if(this.dmiDMinus14 == 0) {
			this.dmiDMinus14 = newEntity.getDmiDMinus14();
		}
		if(this.dmiAdx14 == 0) {
			this.dmiAdx14 = newEntity.getDmiAdx14();
		}
		if(this.dmiAdxr14 == 0) {
			this.dmiAdxr14 = newEntity.getDmiAdxr14();
		}
		if(this.stochasticsD3 == 0) {
			this.stochasticsD3 = newEntity.getStochasticsD3();
		}
		if(this.stochasticsK9 == 0) {
			this.stochasticsK9 = newEntity.getStochasticsK9();
		}
		if(this.stochasticsSlowD3 == 0) {
			this.stochasticsSlowD3 = newEntity.getStochasticsSlowD3();
		}
		if(this.parabolicBuy == 0) {
			this.parabolicBuy = newEntity.getParabolicBuy();
		}
		if(this.parabolicSell == 0) {
			this.parabolicSell = newEntity.getParabolicSell();
		}
		if(this.envelopeDivergence2Bottom == 0) {
			this.envelopeDivergence2Bottom = newEntity.getEnvelopeDivergence2Bottom();
		}
		if(this.envelopeDivergence2Top == 0) {
			this.envelopeDivergence2Top = newEntity.getEnvelopeDivergence2Top();
		}
		if(this.envelopeDivergence3Bottom == 0) {
			this.envelopeDivergence3Bottom = newEntity.getEnvelopeDivergence3Bottom();
		}
		if(this.envelopeDivergence3Top == 0) {
			this.envelopeDivergence3Top = newEntity.getEnvelopeDivergence3Top();
		}
		if(this.envelopeStandard21 == 0) {
			this.envelopeStandard21 = newEntity.getEnvelopeStandard21();
		}
		if(this.gmmaL1with30 == 0) {
			this.gmmaL1with30 = newEntity.getGmmaL1with30();
		}
		if(this.gmmaL2with35 == 0) {
			this.gmmaL2with35 = newEntity.getGmmaL2with35();
		}
		if(this.gmmaL3with40 == 0) {
			this.gmmaL3with40 = newEntity.getGmmaL3with40();
		}
		if(this.gmmaL4with45 == 0) {
			this.gmmaL4with45 = newEntity.getGmmaL4with45();
		}
		if(this.gmmaL5with50 == 0) {
			this.gmmaL5with50 = newEntity.getGmmaL5with50();
		}
		if(this.gmmaL6with60 == 0) {
			this.gmmaL6with60 = newEntity.getGmmaL6with60();
		}
		if(this.gmmaS1with3 == 0) {
			this.gmmaS1with3 = newEntity.getGmmaS1with3();
		}
		if(this.gmmaS2with5 == 0) {
			this.gmmaS2with5 = newEntity.getGmmaS2with5();
		}
		if(this.gmmaS3with8 == 0) {
			this.gmmaS3with8 = newEntity.getGmmaS3with8();
		}
		if(this.gmmaS4with10 == 0) {
			this.gmmaS4with10 = newEntity.getGmmaS4with10();
		}
		if(this.gmmaS5with12 == 0) {
			this.gmmaS5with12 = newEntity.getGmmaS5with12();
		}
		if(this.gmmaS6with15 == 0) {
			this.gmmaS6with15 = newEntity.getGmmaS6with15();
		}
		if(this.gmmaTP21 == 0) {
			this.gmmaTP21 = newEntity.getGmmaTP21();
		}
		if(this.sBollingerMinus1Sigma == 0) {
			this.sBollingerMinus1Sigma = newEntity.getsBollingerMinus1Sigma();
		}
		if(this.sBollingerMinus2Sigma == 0) {
			this.sBollingerMinus2Sigma = newEntity.getsBollingerMinus2Sigma();
		}
		if(this.sBollingerMinus3Sigma == 0) {
			this.sBollingerMinus3Sigma = newEntity.getsBollingerMinus3Sigma();
		}
		if(this.sBollingerPlus1Sigma == 0) {
			this.sBollingerPlus1Sigma = newEntity.getsBollingerPlus1Sigma();
		}
		if(this.sBollingerPlus2Sigma == 0) {
			this.sBollingerPlus2Sigma = newEntity.getsBollingerPlus2Sigma();
		}
		if(this.sBollingerPlus3Sigma == 0) {
			this.sBollingerPlus3Sigma = newEntity.getsBollingerPlus3Sigma();
		}
		if(this.hlBandh20 == 0) {
			this.hlBandh20 = newEntity.getHlBandh20();
		}
		if(this.hlBandl20 == 0) {
			this.hlBandl20 = newEntity.getHlBandl20();
		}
		if(this.hlBandCenter == 0) {
			this.hlBandCenter = newEntity.getHlBandCenter();
		}
		if(this.macd1226 == 0) {
			this.macd1226 = newEntity.getMacd1226();
		}
		if(this.macdDivergence == 0) {
			this.macdDivergence = newEntity.getMacdDivergence();
		}
		if(this.macdParalellSignal9 == 0) {
			this.macdParalellSignal9 = newEntity.getMacdParalellSignal9();
		}
	}
}
