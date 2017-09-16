package fxdi.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fxdi.entity.FXDataEntity;

public class FXDataDao {

	    public FXDataEntity select1record(String currencyPair,String ashi,Date date) throws Exception{
	    	String sql = "SELECT * FROM ? where date = ? and ashi = ?;";
	    	try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/fxdb",
                    "postgres","ppostgres");
	    			PreparedStatement ps = connection.prepareStatement(sql);) {
	            try (ResultSet rs = ps.executeQuery(sql)) {
	            	
	            	return null;
	            }
	        }
	    }
	    
	    public void insert (FXDataEntity entity) throws Exception{

            String sql = "insert into ? (date,yobi,ashi,hajimene,owarine,takane,yasune,sma21,sma55,sma89,span9,span52,spanDelayLine12,dmiDPlus14,dmiDMinus14,dmiAdx14,\r\n" + 
            		"dmiAdxr14,stochasticsK9,stochasticsD3,stochasticsSlowD3,ema5,ema12,ema26,parabolicBuy,parabolicSell,envelopeStandard21,\r\n" + 
            		"envelopeDivergence2Bottom,envelopeDivergence2Top,envelopeDivergence3Bottom,envelopeDivergence3Top,gmmaS1with3,gmmaS2with5,\r\n" + 
            		"gmmaS3with8,gmmaS4with10,gmmaS5with12,gmmaS6with15,gmmaL1with30,gmmaL2with35,gmmaL3with40,gmmaL4with45,gmmaL5with50,\r\n" + 
            		"gmmaL6with60,gmmaTP21,sBollingerDelayLine21,sBollingerPlus1Sigma,sBollingerPlus2Sigma,sBollingerPlus3Sigma,\r\n" + 
            		"sBollingerMinus1Sigma,sBollingerMinus2Sigma,sBollingerMinus3Sigma,hlBandh20,hlBandl20,hlBandCenter,macd1226,\r\n" + 
            		"macdParalellSignal9,macdDivergence,AverageHajimene,AverageOwarine,AverageYasune,AverageTakane) "
            		+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);" ;
            
	        try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/fxdb",
                    "postgres", 
                    "ppostgres");PreparedStatement ps = connection.prepareStatement(sql);) {
	        	
	        	ps.setString(1, entity.getCurrencyPair());
	        	ps.setDate(2, new Date(entity.getDate().getTime()));
	        	ps.setString(3, entity.getYobi());
	        	ps.setString(4, entity.getAshi());
	        	ps.setDouble(5, entity.getHajimene());
	        	ps.setDouble(6, entity.getAverageOwarine());
	        	ps.setDouble(7, entity.getTakane());
	        	ps.setDouble(8, entity.getYasune());
	        	ps.setDouble(9, entity.getSma21());
	        	ps.setDouble(10, entity.getSma55());
	        	ps.setDouble(11, entity.getSma89());
	        	ps.setDouble(12, entity.getSpan9());
	        	ps.setDouble(13, entity.getSpan52());
	        	ps.setDouble(14, entity.getSpanDelayLine12());
	        	ps.setDouble(15, entity.getDmiDPlus14());
	        	ps.setDouble(16, entity.getDmiDMinus14());
	        	ps.setDouble(17, entity.getDmiAdx14());
	        	ps.setDouble(18, entity.getDmiAdxr14());
	        	ps.setDouble(19, entity.getStochasticsK9());
	        	ps.setDouble(20, entity.getStochasticsD3());
	        	ps.setDouble(21, entity.getStochasticsSlowD3());
	        	ps.setDouble(22, entity.getEma5());
	        	ps.setDouble(23, entity.getEma12());
	        	ps.setDouble(24, entity.getEma26());
	        	ps.setDouble(25, entity.getParabolicBuy());
	        	ps.setDouble(26, entity.getParabolicSell());
	        	ps.setDouble(27, entity.getEnvelopeStandard21());
	        	ps.setDouble(28, entity.getEnvelopeDivergence2Bottom());
	        	ps.setDouble(29, entity.getEnvelopeDivergence2Top());
	        	ps.setDouble(30, entity.getEnvelopeDivergence3Bottom());
	        	ps.setDouble(31, entity.getEnvelopeDivergence3Top());
	        	ps.setDouble(32, entity.getGmmaS1with3());
	        	ps.setDouble(33, entity.getGmmaS2with5());
	        	ps.setDouble(34, entity.getGmmaS3with8());
	        	ps.setDouble(35, entity.getGmmaS4with10());
	        	ps.setDouble(36, entity.getGmmaS5with12());
	        	ps.setDouble(37, entity.getGmmaS6with15());
	        	ps.setDouble(38, entity.getGmmaL1with30());
	        	ps.setDouble(39, entity.getGmmaL2with35());
	        	ps.setDouble(40, entity.getGmmaL3with40());
	        	ps.setDouble(41, entity.getGmmaL4with45());
	        	ps.setDouble(42, entity.getGmmaL5with50());
	        	ps.setDouble(43, entity.getGmmaL6with60());
	        	ps.setDouble(44, entity.getGmmaTP21());
	        	ps.setDouble(45, entity.getsBollingerDelayLine21());
	        	ps.setDouble(46, entity.getsBollingerPlus1Sigma());
	        	ps.setDouble(47, entity.getsBollingerPlus2Sigma());
	        	ps.setDouble(48, entity.getsBollingerPlus3Sigma());
	        	ps.setDouble(49, entity.getsBollingerMinus1Sigma());
	        	ps.setDouble(60, entity.getsBollingerMinus2Sigma());
	        	ps.setDouble(51, entity.getsBollingerMinus3Sigma());
	        	ps.setDouble(52, entity.getHlBandh20());
	        	ps.setDouble(53, entity.getHlBandl20());
	        	ps.setDouble(54, entity.getHlBandCenter());
	        	ps.setDouble(55, entity.getMacd1226());
	        	ps.setDouble(56, entity.getMacdParalellSignal9());
	        	ps.setDouble(57, entity.getMacdDivergence());
	        	ps.setDouble(58, entity.getAverageHajimene());
	        	ps.setDouble(59, entity.getAverageOwarine());
	        	ps.setDouble(60, entity.getAverageYasune());
	        	ps.setDouble(61, entity.getAverageTakane());
	        	
	            ps.executeUpdate(sql);
	        }
	    }
	    
}
