package com.xworkz.website;
import com.xworkz.website.dao.WebsiteDAO;
import com.xworkz.website.dao.WebsiteDAOImpl;
import com.xworkz.website.entity.WebsiteEntity;

public class WebsiteScammer {

	public static void main(String[] args) {
		
		WebsiteEntity entity1=new WebsiteEntity("Flipcart","www.flipcart.com","from 2007","Sachin Bansal",".com");
		WebsiteEntity entity2=new WebsiteEntity("Amazon","www.amazon.com","from 2004","Andy Jassy",".com");
		WebsiteEntity entity3=new WebsiteEntity("Kamat hotel","www.hotelkamat.com","from 2000","Venkatesh Krishna",".com");
		WebsiteEntity entity4=new WebsiteEntity("LinkedIn","www.linkedincareer.com","from 2003","Jeff Weiner",".com");
		WebsiteEntity entity5=new WebsiteEntity("Telegram","www.telegram.com","from 2013","Pavel Durov",".com");
		WebsiteEntity entity6=new WebsiteEntity("realme","www.realmemobile.com","from 2018","Sky Li",".com");
		WebsiteEntity entity7=new WebsiteEntity("Bangalore","www.capitalbangalore.com","from 2010","Manjunath",".com");
		WebsiteEntity entity8=new WebsiteEntity("Gangavati","www.flipcart.com","from 2011","Mahesh",".com");
		WebsiteEntity entity9=new WebsiteEntity("koppal","www.flipcart.com","from 2011","Pranitha",".com");
		WebsiteEntity entity10=new WebsiteEntity("Lalitha Jewellery","www.lalithajewellery.com","from 2015","Kiran kumar",".com");
		WebsiteEntity entity11=new WebsiteEntity("google Pay","www.googlepay.com","from 2003","Sumit Goolani",".com");
		WebsiteEntity entity12=new WebsiteEntity("Infosys","www.infosys.com","from 1981","Ashok and NarayanMurthy",".com");
		WebsiteEntity entity13=new WebsiteEntity("TCS","www.tcscareer.com","from 1986","Tata sons",".com");
		WebsiteEntity entity14=new WebsiteEntity("XWORKZ","www.xworkzbtm.in","from 2018","OMKAR B N",".in");
		WebsiteEntity entity15=new WebsiteEntity("BSC and sons","www.bschannabasappa.com","from 1999","Channabasappa",".com");
		WebsiteEntity entity16=new WebsiteEntity("khadi bandra","www.desikhadibandra.com","from 1990","Ashok khadi",".com");
		WebsiteEntity entity17=new WebsiteEntity("government job","www.jobsingovernment.com","from 2005","govinda",".com");
		WebsiteEntity entity18=new WebsiteEntity("instagram","www.instagram.com","from 2012","Kevin Systrom",".com");
		WebsiteEntity entity19=new WebsiteEntity("Naukri","www.getnaukri.com","from 1995","Sanjeev Bikhchandani",".com");
		WebsiteEntity entity20=new WebsiteEntity("Iskcon temple","www.templeiskcon.com","from 2009","Srila Prabhupada",".com");
		
		WebsiteDAO dao=new WebsiteDAOImpl();
		dao.save(entity1);
		dao.save(entity2);
		dao.save(entity3);
		dao.save(entity4);
		dao.save(entity5);
		dao.save(entity6);
		dao.save(entity7);
		dao.save(entity8);
		dao.save(entity9);
		dao.save(entity10);
		dao.save(entity11);
		dao.save(entity12);
		dao.save(entity13);
		dao.save(entity14);
		dao.save(entity15);
		dao.save(entity16);
		dao.save(entity17);
		dao.save(entity18);
		dao.save(entity19);
		dao.save(entity20);
	}

}
