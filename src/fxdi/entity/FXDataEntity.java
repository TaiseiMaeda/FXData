package fxdi.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import fxdi.utils.CodeConstants;

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

	public FXDataEntity importRecordCsv1(String[] record,FXDataEntity entity) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm"); 
		try {
			entity.date = sdf.parse(record[0]);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		entity.hajimene = Double.parseDouble(record[1]);
		entity.takane = Double.parseDouble(record[2]);
		entity.yasune = Double.parseDouble(record[3]);
		entity.owarine = Double.parseDouble(record[4]);
		entity.sma21 = Double.parseDouble(record[5]);
		entity.sma55 = Double.parseDouble(record[6]);
		entity.sma89 = Double.parseDouble(record[7]);
		entity.span9 = Double.parseDouble(record[8]);
		entity.span52 = Double.parseDouble(record[9]);
		entity.spanDelayLine12 = Double.parseDouble(record[10]);
		entity.stochasticsK9 = Double.parseDouble(record[11]);
		entity.stochasticsD3 = Double.parseDouble(record[12]);
		entity.stochasticsSlowD3 = Double.parseDouble(record[13]);
		entity.dmiDPlus14 = Double.parseDouble(record[14]);
		entity.dmiDMinus14 = Double.parseDouble(record[15]);
		entity.dmiAdx14 = Double.parseDouble(record[16]);
		entity.dmiAdxr14 = Double.parseDouble(record[17]);
		entity.yobi = getYobiFromDate(date);
		return entity;
	}
	
	public FXDataEntity importRecordCsv2(String[] record,FXDataEntity entity) {
		entity.ema5 = Double.parseDouble(record[5]);
		entity.ema12 = Double.parseDouble(record[6]);
		entity.ema26 = Double.parseDouble(record[7]);
		entity.parabolicBuy = Double.parseDouble(record[8]);
		entity.parabolicSell = Double.parseDouble(record[9]);
		entity.envelopeStandard21 = Double.parseDouble(record[10]);
		entity.envelopeDivergence2Bottom = Double.parseDouble(record[11]);
		entity.envelopeDivergence2Top = Double.parseDouble(record[12]);
		entity.envelopeDivergence3Bottom = Double.parseDouble(record[13]);
		entity.envelopeDivergence3Top = Double.parseDouble(record[14]);
		entity.gmmaS1with3 = Double.parseDouble(record[15]);
		entity.gmmaS2with5 = Double.parseDouble(record[16]);
		entity.gmmaS3with8 = Double.parseDouble(record[17]);
		entity.gmmaS4with10 = Double.parseDouble(record[18]);
		entity.gmmaS5with12 = Double.parseDouble(record[19]);
		entity.gmmaS6with15 = Double.parseDouble(record[20]);
		entity.gmmaL1with30 = Double.parseDouble(record[21]);
		entity.gmmaL2with35 = Double.parseDouble(record[22]);
		entity.gmmaL3with40 = Double.parseDouble(record[23]);
		entity.gmmaL4with45 = Double.parseDouble(record[24]);
		entity.gmmaL5with50 = Double.parseDouble(record[25]);
		entity.gmmaL6with60 = Double.parseDouble(record[26]);
		entity.gmmaTP21 = Double.parseDouble(record[27]);
		entity.sBollingerPlus1Sigma = Double.parseDouble(record[28]);
		entity.sBollingerMinus1Sigma = Double.parseDouble(record[29]);
		entity.sBollingerPlus2Sigma = Double.parseDouble(record[30]);
		entity.sBollingerMinus2Sigma = Double.parseDouble(record[31]);
		entity.sBollingerPlus3Sigma = Double.parseDouble(record[32]);
		entity.sBollingerMinus3Sigma = Double.parseDouble(record[33]);
		entity.sBollingerDelayLine21 = Double.parseDouble(record[34]);
		entity.hlBandh20 = Double.parseDouble(record[35]);
		entity.hlBandl20 = Double.parseDouble(record[36]);
		entity.hlBandCenter = Double.parseDouble(record[37]);
		entity.macd1226 = Double.parseDouble(record[38]);
		entity.macdParalellSignal9 = Double.parseDouble(record[39]);
		entity.macdDivergence = Double.parseDouble(record[40]);
		entity.AverageHajimene = Double.parseDouble(record[41]);
		entity.AverageTakane = Double.parseDouble(record[42]);
		entity.AverageYasune = Double.parseDouble(record[43]);
		entity.AverageOwarine = Double.parseDouble(record[44]);
		return entity;
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
	
}
