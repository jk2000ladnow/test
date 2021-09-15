package com.webcomm.wallet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcomm.wallet.core.db.entity.CBDCWalletInfoEntity;
import com.webcomm.wallet.core.db.repository.CBDCWalletInfoRepository;
import com.webcomm.wallet.core.exception.Code;
import com.webcomm.wallet.core.model.Rs;
import com.webcomm.wallet.service.RedisService;

@RestController
public class JasonController {
	
	private static Logger logger = LoggerFactory.getLogger(JasonController.class);
	
	@Autowired
	private CBDCWalletInfoRepository cbdcWalletInfoRepository;
	
	private Object syncObj = new Object();
	
	@Autowired
	RedisService redisService;
	
	@RequestMapping(value = "/getRedis", method = RequestMethod.GET)
	public ResponseEntity<?> FUNC_000_Ctrl() throws Exception {
		logger.info(this.getClass().getSimpleName());
		CBDCWalletInfoEntity walletInfo = null;
		Rs rs = new Rs();
		
		synchronized (syncObj) {
			walletInfo = (CBDCWalletInfoEntity) redisService.get("BW-822-2021053115382661");
			
			if (walletInfo == null) {
				walletInfo = cbdcWalletInfoRepository.findByWalletId("BW-822-2021053115382661");
				if (walletInfo == null) {
					rs.setCode(Code.ME2010);
					return ResponseEntity.ok().body(rs);
				}
				redisService.set("BW-822-2021053115382661", walletInfo);
				rs.setCode(Code.Success);
				rs.setRsData(walletInfo.getWalletName() + " : SQL");
				return ResponseEntity.ok().body(rs);
			} 
		}
		
		rs.setCode(Code.Success);
		rs.setRsData(walletInfo.getWalletName() + " : RedisService");
		return ResponseEntity.ok().body(rs);
	}
	
	@RequestMapping(value = "/delRedis", method = RequestMethod.GET)
	public ResponseEntity<?> FUNC_001_Ctrl() throws Exception {
		logger.info(this.getClass().getSimpleName());
		Rs rs = new Rs();
		
		redisService.del("BW-822-2021053115382661");
		
		rs.setCode(Code.Success);
		return ResponseEntity.ok().body(rs);
	}

}
