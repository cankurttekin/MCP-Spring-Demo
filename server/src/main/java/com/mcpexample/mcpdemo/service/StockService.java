package com.mcpexample.mcpdemo.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class StockService {
        
        @Tool(description = "Get the stock price of a company")
        public String getStockPrice(String companyName) {
                if (companyName.equalsIgnoreCase("democompany")) {
                        return "Price = 1 Turkish Liras";
                }

                if (companyName.equalsIgnoreCase("testcompany")) {
                        return "Price = 2TL";
                }
                return "not found";
        }
}

                

