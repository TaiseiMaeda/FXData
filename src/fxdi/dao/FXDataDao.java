package fxdi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;

import fxdi.entity.FXDataEntity;

public class FXDataDao {

	/**
	 * 通貨種類、足、タイムスタンプ型の日時でDBに問い合わせて、
	 * １レコード分のEntityを返却する。見つからなかったらnullを返す。
	 * @param currencyPair
	 * @param ashi
	 * @param date
	 * @return
	 * @throws Exception
	 */
    public FXDataEntity select1record(String currencyPair,String ashi,Timestamp date) throws Exception{
    	FXDataEntity entity = new FXDataEntity(ashi, currencyPair);
    	String sql = "SELECT * FROM "+ currencyPair +" where date = '"+ date + "' and ashi = '" + ashi  +"';";
    	try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/fxdb",
                "postgres","ppostgres");
    			Statement st = connection.createStatement();) {
    		
            try (ResultSet rs = st.executeQuery(sql)) {
            	if(rs.next()) {
            		entity.resultsetToEntity(rs, currencyPair);
            	}
            	return entity;
            }
        }
    }
	    
    public void insert (FXDataEntity entity) throws Exception{

        String sql = "insert into " + entity.getCurrencyPair() +" (date,yobi,ashi,hajimene,owarine,takane,yasune,sma21,sma55,sma89,span9,span52,spanDelayLine12,dmiDPlus14,dmiDMinus14,dmiAdx14," + 
        		"dmiAdxr14,stochasticsK9,stochasticsD3,stochasticsSlowD3,ema5,ema12,ema26,parabolicBuy,parabolicSell,envelopeStandard21," + 
        		"envelopeDivergence2Bottom,envelopeDivergence2Top,envelopeDivergence3Bottom,envelopeDivergence3Top,gmmaS1with3,gmmaS2with5," + 
        		"gmmaS3with8,gmmaS4with10,gmmaS5with12,gmmaS6with15,gmmaL1with30,gmmaL2with35,gmmaL3with40,gmmaL4with45,gmmaL5with50," + 
        		"gmmaL6with60,gmmaTP21,sBollingerDelayLine21,sBollingerPlus1Sigma,sBollingerPlus2Sigma,sBollingerPlus3Sigma," + 
        		"sBollingerMinus1Sigma,sBollingerMinus2Sigma,sBollingerMinus3Sigma,hlBandh20,hlBandl20,hlBandCenter,macd1226," + 
        		"macdParalellSignal9,macdDivergence,AverageHajimene,AverageOwarine,AverageYasune,AverageTakane) "
        		+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);" ;
        
        try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/fxdb",
                "postgres", 
                "ppostgres");PreparedStatement ps = connection.prepareStatement(sql);) {
        	
        	ps.setTimestamp(1, new Timestamp(entity.getDate().getTime()));
        	ps.setString(2, entity.getYobi());
        	ps.setString(3, entity.getAshi());
        	ps.setDouble(4, entity.getHajimene());
        	ps.setDouble(5, entity.getOwarine());
        	ps.setDouble(6, entity.getTakane());
        	ps.setDouble(7, entity.getYasune());
        	ps.setDouble(8, entity.getSma21());
        	ps.setDouble(9, entity.getSma55());
        	ps.setDouble(10, entity.getSma89());
        	ps.setDouble(11, entity.getSpan9());
        	ps.setDouble(12, entity.getSpan52());
        	ps.setDouble(13, entity.getSpanDelayLine12());
        	ps.setDouble(14, entity.getDmiDPlus14());
        	ps.setDouble(15, entity.getDmiDMinus14());
        	ps.setDouble(16, entity.getDmiAdx14());
        	ps.setDouble(17, entity.getDmiAdxr14());
        	ps.setDouble(18, entity.getStochasticsK9());
        	ps.setDouble(19, entity.getStochasticsD3());
        	ps.setDouble(20, entity.getStochasticsSlowD3());
        	ps.setDouble(21, entity.getEma5());
        	ps.setDouble(22, entity.getEma12());
        	ps.setDouble(23, entity.getEma26());
        	ps.setDouble(24, entity.getParabolicBuy());
        	ps.setDouble(25, entity.getParabolicSell());
        	ps.setDouble(26, entity.getEnvelopeStandard21());
        	ps.setDouble(27, entity.getEnvelopeDivergence2Bottom());
        	ps.setDouble(28, entity.getEnvelopeDivergence2Top());
        	ps.setDouble(29, entity.getEnvelopeDivergence3Bottom());
        	ps.setDouble(30, entity.getEnvelopeDivergence3Top());
        	ps.setDouble(31, entity.getGmmaS1with3());
        	ps.setDouble(32, entity.getGmmaS2with5());
        	ps.setDouble(33, entity.getGmmaS3with8());
        	ps.setDouble(34, entity.getGmmaS4with10());
        	ps.setDouble(35, entity.getGmmaS5with12());
        	ps.setDouble(36, entity.getGmmaS6with15());
        	ps.setDouble(37, entity.getGmmaL1with30());
        	ps.setDouble(38, entity.getGmmaL2with35());
        	ps.setDouble(39, entity.getGmmaL3with40());
        	ps.setDouble(40, entity.getGmmaL4with45());
        	ps.setDouble(41, entity.getGmmaL5with50());
        	ps.setDouble(42, entity.getGmmaL6with60());
        	ps.setDouble(43, entity.getGmmaTP21());
        	ps.setDouble(44, entity.getsBollingerDelayLine21());
        	ps.setDouble(45, entity.getsBollingerPlus1Sigma());
        	ps.setDouble(46, entity.getsBollingerPlus2Sigma());
        	ps.setDouble(47, entity.getsBollingerPlus3Sigma());
        	ps.setDouble(48, entity.getsBollingerMinus1Sigma());
        	ps.setDouble(49, entity.getsBollingerMinus2Sigma());
        	ps.setDouble(50, entity.getsBollingerMinus3Sigma());
        	ps.setDouble(51, entity.getHlBandh20());
        	ps.setDouble(52, entity.getHlBandl20());
        	ps.setDouble(53, entity.getHlBandCenter());
        	ps.setDouble(54, entity.getMacd1226());
        	ps.setDouble(55, entity.getMacdParalellSignal9());
        	ps.setDouble(56, entity.getMacdDivergence());
        	ps.setDouble(57, entity.getAverageHajimene());
        	ps.setDouble(58, entity.getAverageOwarine());
        	ps.setDouble(59, entity.getAverageYasune());
        	ps.setDouble(60, entity.getAverageTakane());
        	
            ps.executeUpdate();
        }
    }
    
    public void update (FXDataEntity entity) throws Exception{

        String sql = "update " + entity.getCurrencyPair() +" SET (yobi,hajimene,owarine,takane,yasune,sma21,sma55,sma89,span9,span52,spanDelayLine12,dmiDPlus14,dmiDMinus14,dmiAdx14," + 
        		"dmiAdxr14,stochasticsK9,stochasticsD3,stochasticsSlowD3,ema5,ema12,ema26,parabolicBuy,parabolicSell,envelopeStandard21," + 
        		"envelopeDivergence2Bottom,envelopeDivergence2Top,envelopeDivergence3Bottom,envelopeDivergence3Top,gmmaS1with3,gmmaS2with5," + 
        		"gmmaS3with8,gmmaS4with10,gmmaS5with12,gmmaS6with15,gmmaL1with30,gmmaL2with35,gmmaL3with40,gmmaL4with45,gmmaL5with50," + 
        		"gmmaL6with60,gmmaTP21,sBollingerDelayLine21,sBollingerPlus1Sigma,sBollingerPlus2Sigma,sBollingerPlus3Sigma," + 
        		"sBollingerMinus1Sigma,sBollingerMinus2Sigma,sBollingerMinus3Sigma,hlBandh20,hlBandl20,hlBandCenter,macd1226," + 
        		"macdParalellSignal9,macdDivergence,AverageHajimene,AverageOwarine,AverageYasune,AverageTakane) ="
        		+ " (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) where date = ? AND ashi = ?;";
        
        try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/fxdb",
                "postgres", 
                "ppostgres");PreparedStatement ps = connection.prepareStatement(sql);) {
        	
        	ps.setString(1, entity.getYobi());
        	ps.setDouble(2, entity.getHajimene());
        	ps.setDouble(3, entity.getOwarine());
        	ps.setDouble(4, entity.getTakane());
        	ps.setDouble(5, entity.getYasune());
        	ps.setDouble(6, entity.getSma21());
        	ps.setDouble(7, entity.getSma55());
        	ps.setDouble(8, entity.getSma89());
        	ps.setDouble(9, entity.getSpan9());
        	ps.setDouble(10, entity.getSpan52());
        	ps.setDouble(11, entity.getSpanDelayLine12());
        	ps.setDouble(12, entity.getDmiDPlus14());
        	ps.setDouble(13, entity.getDmiDMinus14());
        	ps.setDouble(14, entity.getDmiAdx14());
        	ps.setDouble(15, entity.getDmiAdxr14());
        	ps.setDouble(16, entity.getStochasticsK9());
        	ps.setDouble(17, entity.getStochasticsD3());
        	ps.setDouble(18, entity.getStochasticsSlowD3());
        	ps.setDouble(19, entity.getEma5());
        	ps.setDouble(20, entity.getEma12());
        	ps.setDouble(21, entity.getEma26());
        	ps.setDouble(22, entity.getParabolicBuy());
        	ps.setDouble(23, entity.getParabolicSell());
        	ps.setDouble(24, entity.getEnvelopeStandard21());
        	ps.setDouble(25, entity.getEnvelopeDivergence2Bottom());
        	ps.setDouble(26, entity.getEnvelopeDivergence2Top());
        	ps.setDouble(27, entity.getEnvelopeDivergence3Bottom());
        	ps.setDouble(28, entity.getEnvelopeDivergence3Top());
        	ps.setDouble(29, entity.getGmmaS1with3());
        	ps.setDouble(30, entity.getGmmaS2with5());
        	ps.setDouble(31, entity.getGmmaS3with8());
        	ps.setDouble(32, entity.getGmmaS4with10());
        	ps.setDouble(33, entity.getGmmaS5with12());
        	ps.setDouble(34, entity.getGmmaS6with15());
        	ps.setDouble(35, entity.getGmmaL1with30());
        	ps.setDouble(36, entity.getGmmaL2with35());
        	ps.setDouble(37, entity.getGmmaL3with40());
        	ps.setDouble(38, entity.getGmmaL4with45());
        	ps.setDouble(39, entity.getGmmaL5with50());
        	ps.setDouble(40, entity.getGmmaL6with60());
        	ps.setDouble(41, entity.getGmmaTP21());
        	ps.setDouble(42, entity.getsBollingerDelayLine21());
        	ps.setDouble(43, entity.getsBollingerPlus1Sigma());
        	ps.setDouble(44, entity.getsBollingerPlus2Sigma());
        	ps.setDouble(45, entity.getsBollingerPlus3Sigma());
        	ps.setDouble(46, entity.getsBollingerMinus1Sigma());
        	ps.setDouble(47, entity.getsBollingerMinus2Sigma());
        	ps.setDouble(48, entity.getsBollingerMinus3Sigma());
        	ps.setDouble(49, entity.getHlBandh20());
        	ps.setDouble(50, entity.getHlBandl20());
        	ps.setDouble(51, entity.getHlBandCenter());
        	ps.setDouble(52, entity.getMacd1226());
        	ps.setDouble(53, entity.getMacdParalellSignal9());
        	ps.setDouble(54, entity.getMacdDivergence());
        	ps.setDouble(55, entity.getAverageHajimene());
        	ps.setDouble(56, entity.getAverageOwarine());
        	ps.setDouble(57, entity.getAverageYasune());
        	ps.setDouble(58, entity.getAverageTakane());
        	ps.setTimestamp(59, new Timestamp(entity.getDate().getTime()));
        	ps.setString(60, entity.getAshi());
            ps.executeUpdate();
        }
    }
	        
}
