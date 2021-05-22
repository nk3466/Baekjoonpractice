package com.programmer.year2021.month05;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

public class Result {
	
	public static List<String> preprocessDate(List<String> dates) throws ParseException {


				for(int i = 0; i < dates.size(); i++) {
		    		
		    		if (dates.get(i).contains("th")) {
		    			dates.set(i, dates.get(i).replace("th", ""));
		    			
		    		}else if(dates.get(i).contains("st")) {
		    			dates.set(i, dates.get(i).replace("st", ""));
		    			
		    		}else if(dates.get(i).contains("nd")) {
		    			dates.set(i, dates.get(i).replace("nd", ""));
		    			
		    		}else if(dates.get(i).contains("rd")) {
		    			dates.set(i, dates.get(i).replace("rd", ""));
		    			
		    		}
				}
				
				for(int i = 0; i < dates.size(); i++) {
		    		
		    		if (dates.get(i).contains("Jan")) {
		    			dates.set(i, dates.get(i).replace("Jan", "01"));
		    			
		    		}else if(dates.get(i).contains("Feb")) {
		    			dates.set(i, dates.get(i).replace("Feb", "02"));
		    			
		    		}else if(dates.get(i).contains("Mar")) {
		    			dates.set(i, dates.get(i).replace("Mar", "03"));
		    			
		    		}else if(dates.get(i).contains("Apr")) {
		    			dates.set(i, dates.get(i).replace("Apr", "04"));
		    			
		    		}else if(dates.get(i).contains("May")) {
		    			dates.set(i, dates.get(i).replace("May", "05"));
		    			
		    		}else if(dates.get(i).contains("Jun")) {
		    			dates.set(i, dates.get(i).replace("Jun", "06"));
		    			
		    		}else if(dates.get(i).contains("Jul")) {
		    			dates.set(i, dates.get(i).replace("Jul", "07"));
		    			
		    		}else if(dates.get(i).contains("Aug")) {
		    			dates.set(i, dates.get(i).replace("Aug", "08"));
		    			
		    		}else if(dates.get(i).contains("Sep")) {
		    			dates.set(i, dates.get(i).replace("Sep", "09"));
		    			
		    		}else if(dates.get(i).contains("Oct")) {
		    			dates.set(i, dates.get(i).replace("Oct", "10"));
		    			
		    		}else if(dates.get(i).contains("Nov")) {
		    			dates.set(i, dates.get(i).replace("Nov", "11"));
		    			
		    		}else if(dates.get(i).contains("Dec")) {
		    			dates.set(i, dates.get(i).replace("Dec", "12"));
		    			
		    		}
				}
	            SimpleDateFormat sd = new SimpleDateFormat("YYYY-MM-DD", Locale.KOREA);
	            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM YYYY").withLocale(Locale.ENGLISH);
	            LocalDate id = LocalDate.parse(dates.get(0), dateTimeFormatter);
	            String koDate = id.format(DateTimeFormatter.ofPattern("YYYY-MM-DD"));
	            System.out.println("어 : " + koDate);
	            Date nowDate = new Date();
	            System.out.println(sd.parse(dates.get(0)));
	            for(int i = 0; i < dates.size(); i++) {
	            	sd.parse(dates.get(i));
	            	dates.set(i, (sd.format(dates.get(i))));
	            }
	            
	            return dates;
	    }
	
	 public static void main(String[] args) throws IOException, ParseException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        int datesCount = Integer.parseInt(bufferedReader.readLine().trim());

	        List<String> dates = IntStream.range(0, datesCount).mapToObj(i -> {
	            try {
	                return bufferedReader.readLine();
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        })
	            .collect(toList());

	        List<String> result = Result.preprocessDate(dates);

	        bufferedWriter.write(
	            result.stream()
	                .collect(joining("\n"))
	            + "\n"
	        );

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
}


