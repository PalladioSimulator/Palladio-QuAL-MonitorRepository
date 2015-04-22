/**
 */
package org.palladiosimulator.monitorrepository.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.palladiosimulator.monitorrepository.Monitor;
import org.palladiosimulator.monitorrepository.MonitorrepositoryFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Monitor</b></em>'. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class MonitorTest extends TestCase {

    /**
     * The fixture for this Monitor test case. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Monitor fixture = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(MonitorTest.class);
    }

    /**
     * Constructs a new Monitor test case with the given name. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public MonitorTest(final String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Monitor test case. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void setFixture(final Monitor fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Monitor test case. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Monitor getFixture() {
        return this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(MonitorrepositoryFactory.eINSTANCE.createMonitor());
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

} // MonitorTest
