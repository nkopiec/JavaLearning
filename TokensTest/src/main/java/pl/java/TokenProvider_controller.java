package pl.java;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.logging.Logger;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Level;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;

@RestController
public class TokenProvider_controller {
	@GetMapping(path = "/")
	public String get() {
	    Date expirationDate = DateUtils.addHours(new Date(), 1);
	    String jwt = "Jwts.builder FAILED";
	    try {
	        jwt = Jwts.builder()
	              .setIssuer("http://itger.pl/")
	              .setSubject("users/Janusz i Gra¿yna")
	              .setAudience("something")
	              .setExpiration(expirationDate)
	              .claim("name", "Janusz i Gra¿yna Nosacz")
	              .claim("scope", "self groups/admins")
	              .signWith(SignatureAlgorithm.HS256, "secretPassword".getBytes("UTF-8"))
	              .compact();
	} catch (UnsupportedEncodingException ex) {
	   Logger.getLogger(TokenProvider_controller.class.getName()).log(java.util.logging.Level.ALL, null, ex);
	}
	return jwt;
	}
	
	@GetMapping("/verify/{token}")
	public @ResponseBody 
	ResponseEntity<String> verify(@PathVariable String token) {
	    String subject = "Something Wrong! ";
	    try {
	        Jws<Claims> jwtClaims = Jwts.parser()
	                               .setSigningKey("secretPassword".getBytes("UTF-8"))
	                               .parseClaimsJws(token);
	        subject = jwtClaims.getBody().getSubject();
	    } catch (SignatureException | UnsupportedEncodingException ex) {
	        subject = subject.concat(ex.getLocalizedMessage());
	        Logger.getLogger(TokenProvider_controller.class.getName())
	                        .log(java.util.logging.Level.ALL, null, ex);
	}
	return new ResponseEntity<>("GET Response : " + subject, HttpStatus.OK);
	}
	
}
 