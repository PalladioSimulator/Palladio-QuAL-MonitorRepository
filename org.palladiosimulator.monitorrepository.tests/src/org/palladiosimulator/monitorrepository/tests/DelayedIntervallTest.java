/**
 */
package org.palladiosimulator.monitorrepository.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.monitorrepository.DelayedIntervall;
import org.palladiosimulator.monitorrepository.MonitorrepositoryFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Delayed Intervall</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DelayedIntervallTest extends IntervallTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(DelayedIntervallTest.class);
    }

    /**
     * Constructs a new Delayed Intervall test case with the given name. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public DelayedIntervallTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Delayed Intervall test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected DelayedIntervall getFixture() {
        return (DelayedIntervall) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(MonitorrepositoryFactory.eINSTANCE.createDelayedIntervall());
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

} // DelayedIntervallTest
