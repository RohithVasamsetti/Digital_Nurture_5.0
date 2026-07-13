SET SERVEROUTPUT ON;

--------------------------------------------------------------
-- Scenario 1:
-- Apply 1% discount to loan interest rates
-- for customers above 60 years old.
--------------------------------------------------------------

BEGIN
    FOR rec IN (
        SELECT CustomerID
        FROM Customers
        WHERE Age > 60
    )
    LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = rec.CustomerID;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('1% discount applied successfully.');
END;
/

--------------------------------------------------------------
-- Scenario 2:
-- Promote customers to VIP if balance > 10000
--------------------------------------------------------------

BEGIN
    FOR rec IN (
        SELECT CustomerID
        FROM Customers
        WHERE Balance > 10000
    )
    LOOP
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = rec.CustomerID;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('VIP status updated successfully.');
END;
/

--------------------------------------------------------------
-- Scenario 3:
-- Print reminders for loans due within next 30 days
--------------------------------------------------------------

BEGIN
    FOR rec IN (
        SELECT c.CustomerName,
               l.LoanID,
               l.DueDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear '
            || rec.CustomerName
            || ', your Loan ID '
            || rec.LoanID
            || ' is due on '
            || TO_CHAR(rec.DueDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/