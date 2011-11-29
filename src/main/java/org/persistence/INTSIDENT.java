package org.persistence;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.persistence.INTSIDENDI_LIIK;
import javax.persistence.ManyToOne;
import org.persistence.OBJEKT_INTSIDENDIS;
import java.util.Collection;
import javax.persistence.OneToMany;
import org.persistence.ISIK_INTSIDENDIS;
import org.persistence.PIIRIVALVUR_INTSIDENDIS;
import org.persistence.VAHTKOND_INTSIDENDIS;
import org.persistence.PIIRILOIK;


@Entity
@RooToString
@RooEntity
@Table(name = "T_INTSIDENT")
public class INTSIDENT {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="INTSIDENT_ID", unique=true, nullable=false)
	private Long intsidentId;
	
	
	@Column(name="INTSIDENT_LIIK_ID")
	private Long intsidentLiikId;
	

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date avatud;

	@Column(name="GPS_LATITUUD", precision=9)
	private BigDecimal gpsLatituud;

	@Column(name="GPS_LONGITUUD", precision=9)
	private BigDecimal gpsLongituud;

	private String kirjeldus;

	private String kommentaar;

	@Column(length=20)
	private String kood;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

	@Column(length=100)
	private String nimetus;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

    @Temporal( TemporalType.DATE)
	@Column(name="TOIMUMISE_ALGUS")
	private Date toimumiseAlgus;

    @Temporal( TemporalType.DATE)
	@Column(name="TOIMUMISE_LOPP")
	private Date toimumiseLopp;


	@ManyToOne
	private INTSIDENDI_LIIK iNTSIDENDI_LIIK_ID;


	@OneToMany(mappedBy = "iNTSIDENT_ID")
	private Collection<OBJEKT_INTSIDENDIS> oBJEKT_INTSIDENDIS;


	@OneToMany(mappedBy = "iNTSIDENT_ID")
	private Collection<ISIK_INTSIDENDIS> iSIK_INTSIDENDIS;


	@OneToMany(mappedBy = "iNTSIDENT_ID")
	private Collection<PIIRIVALVUR_INTSIDENDIS> pIIRIVALVUR_INTSIDENDIS;


	@OneToMany(mappedBy = "iNTSIDENT_ID")
	private Collection<VAHTKOND_INTSIDENDIS> vAHTKOND_INTSIDENDIS;


	@ManyToOne
	private PIIRILOIK pIIRILOIK_ID;


	public INTSIDENT() {
    	super();
    }

	public Long getIntsidentId() {
		return this.intsidentId;
	}

	public void setIntsidentId(Long intsidentId) {
		this.intsidentId = intsidentId;
	}

	public Long getIntsidentLiikId() {
		return intsidentLiikId;
	}

	public void setIntsidentLiikId(Long intsidentLiikId) {
		this.intsidentLiikId = intsidentLiikId;
	}
	
	
	public String getAvaja() {
		return this.avaja;
	}

	public void setAvaja(String avaja) {
		this.avaja = avaja;
	}

	public Date getAvatud() {
		return this.avatud;
	}

	public void setAvatud(Date avatud) {
		this.avatud = avatud;
	}

	public BigDecimal getGpsLatituud() {
		return this.gpsLatituud;
	}

	public void setGpsLatituud(BigDecimal gpsLatituud) {
		this.gpsLatituud = gpsLatituud;
	}

	public BigDecimal getGpsLongituud() {
		return this.gpsLongituud;
	}

	public void setGpsLongituud(BigDecimal gpsLongituud) {
		this.gpsLongituud = gpsLongituud;
	}

	public String getKirjeldus() {
		return this.kirjeldus;
	}

	public void setKirjeldus(String kirjeldus) {
		this.kirjeldus = kirjeldus;
	}

	public String getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}

	public String getKood() {
		return this.kood;
	}

	public void setKood(String kood) {
		this.kood = kood;
	}

	public Date getMuudetud() {
		return this.muudetud;
	}

	public void setMuudetud(Date muudetud) {
		this.muudetud = muudetud;
	}

	public String getMuutja() {
		return this.muutja;
	}

	public void setMuutja(String muutja) {
		this.muutja = muutja;
	}

	public String getNimetus() {
		return this.nimetus;
	}

	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
	}

	public Date getSuletud() {
		return this.suletud;
	}

	public void setSuletud(Date suletud) {
		this.suletud = suletud;
	}

	public String getSulgeja() {
		return this.sulgeja;
	}

	public void setSulgeja(String sulgeja) {
		this.sulgeja = sulgeja;
	}

	public Date getToimumiseAlgus() {
		return this.toimumiseAlgus;
	}

	public void setToimumiseAlgus(Date toimumiseAlgus) {
		this.toimumiseAlgus = toimumiseAlgus;
	}

	public Date getToimumiseLopp() {
		return this.toimumiseLopp;
	}

	public void setToimumiseLopp(Date toimumiseLopp) {
		this.toimumiseLopp = toimumiseLopp;
	}

	public INTSIDENDI_LIIK getINTSIDENDI_LIIK_ID() {
	    return iNTSIDENDI_LIIK_ID;
	}

	public void setINTSIDENDI_LIIK_ID(INTSIDENDI_LIIK param) {
	    this.iNTSIDENDI_LIIK_ID = param;
	}

	public Collection<OBJEKT_INTSIDENDIS> getOBJEKT_INTSIDENDIS() {
	    return oBJEKT_INTSIDENDIS;
	}

	public void setOBJEKT_INTSIDENDIS(Collection<OBJEKT_INTSIDENDIS> param) {
	    this.oBJEKT_INTSIDENDIS = param;
	}

	public Collection<ISIK_INTSIDENDIS> getISIK_INTSIDENDIS() {
	    return iSIK_INTSIDENDIS;
	}

	public void setISIK_INTSIDENDIS(Collection<ISIK_INTSIDENDIS> param) {
	    this.iSIK_INTSIDENDIS = param;
	}

	public Collection<PIIRIVALVUR_INTSIDENDIS> getPIIRIVALVUR_INTSIDENDIS() {
	    return pIIRIVALVUR_INTSIDENDIS;
	}

	public void setPIIRIVALVUR_INTSIDENDIS(Collection<PIIRIVALVUR_INTSIDENDIS> param) {
	    this.pIIRIVALVUR_INTSIDENDIS = param;
	}

	public Collection<VAHTKOND_INTSIDENDIS> getVAHTKOND_INTSIDENDIS() {
	    return vAHTKOND_INTSIDENDIS;
	}

	public void setVAHTKOND_INTSIDENDIS(Collection<VAHTKOND_INTSIDENDIS> param) {
	    this.vAHTKOND_INTSIDENDIS = param;
	}

	public PIIRILOIK getPIIRILOIK_ID() {
	    return pIIRILOIK_ID;
	}

	public void setPIIRILOIK_ID(PIIRILOIK param) {
	    this.pIIRILOIK_ID = param;
	}

}