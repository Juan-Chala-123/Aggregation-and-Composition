# Dental Clinic

## Class
  
### Dentist
- name
- specialty
- professionalCardNumber

### Patient
- name
- documentNumber
- telephone

### Treatments
- startDate
- diagnosis
- estimatedCost

### Sessions
- date
- procedurePerformed

### Clinics
- name
- address
- telephone

## Relationships

### Composition
Treatments - Sessions

Patient - Treatments

### Aggregation
Clinics - Dentist

Destist - Sessions

## UML

![UML - Dental Clinic](./img/clinic.png)