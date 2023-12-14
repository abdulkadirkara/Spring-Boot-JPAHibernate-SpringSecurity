package com.nomadsoft.aracihaletur.entity;

import java.math.BigDecimal;
import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;
import com.nomadsoft.aracihaletur.utility.VitesEnum;
import com.nomadsoft.aracihaletur.utility.YakitEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Document(collection = "cars")
public class Cars {
	
	@Id
	private Long id;
	@Getter
	@Setter
	private String marka;
	@Getter
	@Setter
	private String seri;
	@Getter
	@Setter
	private String model;
	@Getter
	@Setter
	private int yıl;
	@Getter
	@Setter
	private double km;
	@Getter
	@Setter
	private Enum<YakitEnum> yakit;
	@Getter
	@Setter
	private Enum<VitesEnum> vites;
	@Getter
	@Setter
	private int motorHacmi;
	@Getter
	@Setter
	private String tasfiyeNedeni;
	@Getter
	@Setter
	private String bulunduguYer;
	@Getter
	@Setter
	private BigDecimal esasSatisBedeli;
	@Getter
	@Setter
	private BigDecimal teminatBedeli;
	@Getter
	@Setter
	private BigDecimal baslangicBedeli;
	@Getter
	@Setter
	private Date GorusBaslangicTarihi;
	@Getter
	@Setter
	private Date teklifBaslangicTarihi;
	@Getter
	@Setter
	private Date ihaleBitisTarihi;
	@Getter
	@Setter
	private String ihaleDetay;
	@Getter
	@Setter
	private String expertizRaporu;
	
	
}