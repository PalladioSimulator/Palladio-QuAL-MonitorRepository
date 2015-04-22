/**
 */
package org.palladiosimulator.monitorrepository.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.monitorrepository.MonitorrepositoryFactory;
import org.palladiosimulator.monitorrepository.TimeFrame;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Time Frame</b></em>'. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class TimeFrameTest extends TemporalCharacterizationTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(TimeFrameTest.class);
    }

    /**
     * Constructs a new Time Frame test case with the given name. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public TimeFrameTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Time Frame test case. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    @Override
    protected TimeFrame getFixture() {
        return (TimeFrame) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(MonitorrepositoryFactory.eINSTANCE.createTimeFrame());
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

} // TimeFrameTest
