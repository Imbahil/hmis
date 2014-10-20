/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divudi.data.hr;

/**
 *
 * @author Buddhika
 */
public enum LeaveType {
    Casual, //7
    CasualHalf,    
    Annual, //14
    AnnualHalf,
    Medical, //14
    @Deprecated
    Maternity, 
    Maternity1st, // 84 working days 
    Maternity2nd, // 42 working Days
    @Deprecated
    Sick, //    
    Lieu,
    LieuHalf,
    No_Pay,
    @Deprecated
    Absent,
    Other,
}
