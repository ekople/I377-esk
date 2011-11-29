package org.persistence;

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
import org.persistence.ISIK_INTSIDENDIS;
import java.util.Collection;
import javax.persistence.OneToMany;

@Entity
@RooToString
@RooEntity
@Table(name = "T_PIIRIRIKKUJA")
public class PIIRIRIKKUJA {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PIIRIRIKKUJA_ID", unique=true, nullable=false)
	private Long piiririkkujaId;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date avatud;

	@Column(length=25)
	private String eesnimi;

	@Column(length=20)
	private String isikukood;

	private String kommentaar;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

	@Column(name="PEREK_NIMI", length=35)
	private String perekNimi;

	@Column(length=1)
	private String sugu;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

    @Temporal( TemporalType.DATE)
	private Date synniaeg;

	@OneToMany(mappedBy = "pIIRIRIKKUJA_ID")
	private Collection<ISIK_INTSIDENDIS> iSIK_INTSIDENDIS;

	public PIIRIRIKKUJA() {
    	super();
    }
	
	public Long getPiiririkkujaId() {
		return this.piiririkkujaId;
	}

	public void setPiiririkkujaId(Long piiririkkujaId) {
		this.piiririkkujaId = piiririkkujaId;
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

	public String getEesnimi() {
		return this.eesnimi;
	}

	public void setEesnimi(String eesnimi) {
		this.eesnimi = eesnimi;
	}

	public String getIsikukood() {
		return this.isikukood;
	}

	public void setIsikukood(String isikukood) {
		this.isikukood = isikukood;
	}

	public String getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
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

	public String getPerekNimi() {
		return this.perekNimi;
	}

	public void setPerekNimi(String perekNimi) {
		this.perekNimi = perekNimi;
	}

	public String getSugu() {
		return this.sugu;
	}

	public void setSugu(String sugu) {
		this.sugu = sugu;
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

	public Date getSynniaeg() {
		return this.synniaeg;
	}

	public void setSynniaeg(Date synniaeg) {
		this.synniaeg = synniaeg;
	}

	public Collection<ISIK_INTSIDENDIS> getISIK_INTSIDENDIS() {
	    return iSIK_INTSIDENDIS;
	}

	public void setISIK_INTSIDENDIS(Collection<ISIK_INTSIDENDIS> param) {
	    this.iSIK_INTSIDENDIS = param;
	}

}