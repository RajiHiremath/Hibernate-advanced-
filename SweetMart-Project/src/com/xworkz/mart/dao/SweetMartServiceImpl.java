package com.xworkz.mart.dao;
import com.xworkz.mart.entity.SweetMartEntity;

public class SweetMartServiceImpl implements SweetMartService {

	private SweetMartDAO dao;
	

	public SweetMartServiceImpl(SweetMartDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public boolean validationAndSave(SweetMartEntity entity) {
		boolean valid = false;
			if (entity.getName() != null
					&& !entity.getName().isEmpty() && entity.getName().length() > 3 && entity.getName().length() < 25) {
				
			}
			else 
			{
			System.out.println("invalid name");	
		
			}
				if (entity.getOwnerName() != null && !entity.getOwnerName().isEmpty()
						&& entity.getOwnerName().length() > 3 && entity.getOwnerName().length() < 25) {
				}
				else 
				{
					System.out.println("invalid owner name");
					
				}
					if (!(entity.getPhoneNo() < 3 && !(entity.getPhoneNo() > 1000000000))) {
					}
					else
					{
						System.out.println("invalid phone number");
						
					}
						if (!(entity.getAlternativeNo() < 3 && !(entity.getAlternativeNo() > 1000000000))) {
						}
						else
						{
							System.out.println("invalid alternative number");
							
						}
							if (entity.getEmail() != null && !entity.getEmail().isEmpty()
									&& entity.getEmail().length() > 3 && entity.getEmail().length() > 25) {
							}
							else {
								System.out.println("invalid email");
								
							}
								if (entity.getAddress() != null && !entity.getAddress().isEmpty()
										&& entity.getAddress().length() > 3 && entity.getAddress().length() > 25) {
								}
								else {
									System.out.println("invalid address");
									
								}
									if (!(entity.getStarted() < 3 && !(entity.getStarted() > 500000))) {
									}
									else {
									  System.out.println("invalid started");
									  
									}
										if (!(entity.getNoOfWorkers() < 3) && !(entity.getNoOfWorkers() > 500000)) {
										}
										else {
										  System.out.println("invalid no of workers");	
										  
							              }
											if (entity.getOpenTime() != null && !entity.getOpenTime().isEmpty()
													&& entity.getOpenTime().length() > 3
													&& entity.getOpenTime().length() < 25) {
											}
											else {
											    System.out.println("invalid open time of shop");
											    return false;
											}
												if (entity.getCloseTime() != null && !entity.getCloseTime().isEmpty()
														&& entity.getCloseTime().length() > 3
														&& entity.getCloseTime().length() < 25) {
												}
												else {
												 System.out.println("invalid close time of shop");
												 
												}
													if (entity.getAreaOfManufacture() != null
															&& !entity.getAreaOfManufacture().isEmpty()
																	&& entity.getAreaOfManufacture().length() > 3
																	&& entity.getAreaOfManufacture().length() < 25) {
													}
													else {
													   System.out.println("invalid area of manufacture");
													   
													}
													
														if (entity.getQuality() != null
																&& !entity.getQuality().isEmpty()
																		&& entity.getQuality().length() > 3
																		&& entity.getQuality().length() < 25) {
														}
														else {
														  System.out.println("invalid quality");
														  
														}
															if (entity.getCreatedBy() != null
																	&& !entity.getCreatedBy().isEmpty()
																			&& entity.getCreatedBy().length() > 3
																			&& entity.getCreatedBy().length() < 25) {
															}
															else {
															 System.out.println("invalid created by");	
															 
															}
																if (entity.getCreatedAT() != null) {
																}
																else {
																	System.out.println("invalid created at");
																	
																}
																	if (entity.getUpdatedBy() != null
																			&& !entity.getUpdatedBy().isEmpty()
																					&& entity.getUpdatedBy()
																							.length() > 3
																					&& entity.getUpdatedBy()
																							.length() < 25) {
																	}
																	else {
																	  System.out.println("invalid updated by");
																	  
																	}
																		if (entity.getUpdatedAt() != null) {
																			
																		}
																		else {
																		  System.out.println("invalid updated at");	
																		  
																		}
																		if(!valid)
																			{
																			dao.save(entity);
																			}
																		
																		return false;
					  }
}
