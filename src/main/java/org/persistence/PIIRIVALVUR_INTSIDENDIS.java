package org.persistence;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.persistence.INTSIDENT;
import javax.persistence.ManyToOne;
import org.persistence.PIIRIVALVUR;
import org.persistence.PIIRIVALVURI_SEADUS_INTSIDENDI;
import java.util.Collection;
import javax.persistence.OneToMany;


@Entity
@RooToString
@RooEntity
@Table(name = "T_PIIRIVALVUR_INTSIDENDIS")
public class PIIRIVALVUR_INTSIDENDIS {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PIIRIVALVUR_INTSIDENDIS_ID", unique=true, nullable=false)
	private Long piirivalvurIntsidendisId;

    @Temporal( TemporalType.DATE)   @DateTimeFormat(style="M-") 
	private Date alates;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)   @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date avatud;

	private String kirjeldus;

	private String kommentaar;

    @Temporal( TemporalType.DATE)   @DateTimeFormat(style="M-") 
	private Date kuni;

    @Temporal( TemporalType.DATE)   @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

    @Temporal( TemporalType.DATE)   @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

	@ManyToOne
	private INTSIDENT iNTSIDENT_ID;

	@ManyToOne
	private PIIRIVALVUR pIIRIVALVUR_ID;

	@OneToMany(mappedBy = "pIIRIVALVUR_INTSIDENDIS_ID")
	private Collection<PIIRIVALVURI_SEADUS_INTSIDENDI> pIIRIVALVURI_SEADUS_INTSIDENDI;

	public PIIRIVALVUR_INTSIDENDIS() {
    	super();
    }

	public Long getPiirivalvurIntsidendisId() {
		return this.piirivalvurIntsidendisId;
	}

	public void setPiirivalvurIntsidendisId(Long piirivalvurIntsidendisId) {
		this.piirivalvurIntsidendisId = piirivalvurIntsidendisId;
	}

	public Date getAlates() {
		return this.alates;
	}

	public void setAlates(Date alates) {
		this.alates = alates;
	}

	public String getAvaja() {
		return this.avaja;
	}

	public void setAvaja(String avaja) {
		if(avaja == null)
		{
			this.avaja ="SYSTEM";
		}
		else 
		{
			this.avaja = avaja;
		}
	}

	public Date getAvatud() {
		return this.avatud;
	}

	public void setAvatud(Date avatud) {
	if(avatud == null)
	{
		this.avatud = Calendar.getInstance().getTime();
	}
	else
	{
		this.avatud = avatud;
	}
	
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

	public Date getKuni() {
		return this.kuni;
	}

	public void setKuni(Date kuni) {
		this.kuni = kuni;
	}

	public Date getMuudetud() {
		return this.muudetud;
	}

	public void setMuudetud(Date muudetud) {
		if(muudetud == null)
		{
			this.muudetud = Calendar.getInstance().getTime();
		}
		else
		{
			this.muudetud = muudetud;
		}
	}

	public String getMuutja() {
		return this.muutja;
	}

	public void setMuutja(String muutja) {
		if(muutja == null)
		{
			this.muutja ="SYSTEM";
		}
		else 
		{
			this.muutja = muutja;
		}
	}

	public Date getSuletud() {
		return this.suletud;
	}

	public void setSuletud(Date suletud) {
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(9999, 11, 31);
		if(suletud == null)
		{
			this.suletud = cal.getTime();
		}
		else
		{
			this.suletud = suletud;
		}
	}

	public String getSulgeja() {
		return this.sulgeja;
	}

	public void setSulgeja(String sulgeja) {
		if(sulgeja == null)
		{
			this.sulgeja ="SYSTEM";
		}
		else 
		{
			this.sulgeja = sulgeja;
		}
	}

	public INTSIDENT getINTSIDENT_ID() {
	    return iNTSIDENT_ID;
	}

	public void setINTSIDENT_ID(INTSIDENT param) {
	    this.iNTSIDENT_ID = param;
	}

	public PIIRIVALVUR getPIIRIVALVUR_ID() {
	    return pIIRIVALVUR_ID;
	}

	public void setPIIRIVALVUR_ID(PIIRIVALVUR param) {
	    this.pIIRIVALVUR_ID = param;
	}

	public Collection<PIIRIVALVURI_SEADUS_INTSIDENDI> getPIIRIVALVURI_SEADUS_INTSIDENDI() {
	    return pIIRIVALVURI_SEADUS_INTSIDENDI;
	}

	public void setPIIRIVALVURI_SEADUS_INTSIDENDI(Collection<PIIRIVALVURI_SEADUS_INTSIDENDI> param) {
	    this.pIIRIVALVURI_SEADUS_INTSIDENDI = param;
	}

}