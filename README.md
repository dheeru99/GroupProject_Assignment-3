Descriptin: 
This application is a platform for people to find medical resources in different cities and communities. 
The system admin can operate all CRUD operations in the application. The admin has to add the city details in which different communities can be created. Every Community has different hospitals and houses. First, the houses present in the community, the community can have the details of the houses situated and also the details of the persons living in the Houses.
Community admin can able to modify and remove the data from the community. 
On the other hand, community will have the list of hospitals and will be able to add doctors, and patients to the hospital. After assigning a particular patient to a doctor, the doctor can add the vital signs of that particular patient that leaves an encounter, and if multiple vital signs are taken all those details will be stored in the encounter history. 
The person will be able to search for the hospitals located in their community either by city/community. If the person assigned to a hospital or doctor, they will be converted into the patient.
System Admin:
•	Can create City, Community, House, Doctor, Person, Hospital
•	Will be able to perform CRUD operations on all the information in the application.
City:
•	Can create the cities with communities.
•	User can perform CRUD operations to city profile.
Community Admin:
•	This role can only modify the information present only under community.
•	The community admin can update and delete all the information under community but not city information.
Community:
•	This will have the information of the houses and hospitals located in the community.
•	User can perform the CRUD operations on all the information present under community.
House:
•	Here we can add the persons living in the community.
•	CRUD operations can be performed here.
Hospital:
•	This directory will have the info of all the hospitals located in the community.
•	The information can be modifies using CRUD.


Doctor:
•	This will have all the information about the doctors. Here we can add new doctor’s information and also CRUD can be performed.
•	Doctor has to assign to a hospital to treat a patient.
•	The doctor can login to his portal and select the patient assigned to him to view his details.
Person:
•	This directory will have all the information about the persons living in the community.
•	A person will remain as a person under person directory as long as he is not assigned to any doctor and hospital.
Patient:
•	Here we will be able to add information about the patients and will have all the information about the patients.
•	A new patient cannot be added to directory without being assigned to a doctor.
•	Any info about person present in person directory will be added to patient directory as patient if a doctor and hospital is assigned to the person.
Vital Signs:
•	Once a doctor attends a patient if he collects the vital signs of the patient, the details can be added as an encounter.
Encounter;
•	All the vital signs collected and added by the doctor will be present in encounter history.
•	If multiple vital signs are collected, all the vital signs of the patient will be saved as encounter history.
•	All these vital signs can be added to only be entering the doctor’s portal.




