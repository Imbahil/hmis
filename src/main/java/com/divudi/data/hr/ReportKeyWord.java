/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.divudi.data.hr;

import com.divudi.data.PaymentMethod;
import com.divudi.entity.Department;
import com.divudi.entity.Institution;
import com.divudi.entity.Item;
import com.divudi.entity.Patient;
import com.divudi.entity.Speciality;
import com.divudi.entity.Staff;
import com.divudi.entity.hr.Designation;
import com.divudi.entity.hr.Roster;
import com.divudi.entity.hr.Shift;
import com.divudi.entity.hr.StaffCategory;
import com.divudi.entity.hr.StaffShift;

/**
 *
 * @author safrin
 */
public class ReportKeyWord {
    Staff staff;
    Staff replacingStaff;
    Department department;
    StaffCategory staffCategory;
    Designation designation;
    Roster roster;
    Shift shift;
    Speciality speciality;
    Patient patient;
    Institution institution;
    PaymentMethod paymentMethod;
    Item item;
    StaffShift staffShift;
    LeaveType leaveType;

    public LeaveType getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(LeaveType leaveType) {
        this.leaveType = leaveType;
    }
    
    

    public StaffShift getStaffShift() {
        return staffShift;
    }

    public void setStaffShift(StaffShift staffShift) {
        this.staffShift = staffShift;
    }
    
    
    
    

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    
    
    

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public StaffCategory getStaffCategory() {
        return staffCategory;
    }

    public void setStaffCategory(StaffCategory staffCategory) {
        this.staffCategory = staffCategory;
    }

    

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public Roster getRoster() {
        return roster;
    }

    public void setRoster(Roster roster) {
        this.roster = roster;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public Staff getReplacingStaff() {
        return replacingStaff;
    }

    public void setReplacingStaff(Staff replacingStaff) {
        this.replacingStaff = replacingStaff;
    }
    
    
    
}
