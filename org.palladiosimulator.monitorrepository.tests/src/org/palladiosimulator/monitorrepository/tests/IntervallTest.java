/**
 */
package org.palladiosimulator.monitorrepository.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.monitorrepository.Intervall;
import org.palladiosimulator.monitorrepository.MonitorrepositoryFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Intervall</b></em>'. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class IntervallTest extends TemporalCharacterizationTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(IntervallTest.class);
    }

    /**
     * Constructs a new Intervall test case with the given name. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public IntervallTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Intervall test case. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    @Override
    protected Intervall getFixture() {
        return (Intervall) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(MonitorrepositoryFactory.eINSTANCE.createIntervall());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        this.setFixture(null);
    }

} // IntervallTest
