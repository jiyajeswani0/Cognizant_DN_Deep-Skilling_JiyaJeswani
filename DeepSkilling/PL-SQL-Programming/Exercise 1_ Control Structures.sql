UPDATE Customers
SET DOB = TO_DATE('1955-05-15', 'YYYY-MM-DD')
WHERE CustomerID = 1;

COMMIT;


DECLARE
    v_age NUMBER;
BEGIN
    FOR cust IN (SELECT CustomerID, DOB FROM Customers)
    LOOP
        v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, cust.DOB) / 12);

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;
        END IF;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Interest rates updated successfully.');
END;
/