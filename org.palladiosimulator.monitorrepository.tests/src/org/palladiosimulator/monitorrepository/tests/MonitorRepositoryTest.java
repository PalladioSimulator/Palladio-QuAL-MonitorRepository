/**
 */
package org.palladiosimulator.monitorrepository.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorrepositoryFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Monitor Repository</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class MonitorRepositoryTest extends TestCase {

    /**
     * The fixture for this Monitor Repository test case. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    protected MonitorRepository fixture = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(MonitorRepositoryTest.class);
    }

    /**
     * Constructs a new Monitor Repository test case with the given name. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public MonitorRepositoryTest(final String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Monitor Repository test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected void setFixture(final MonitorRepository fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Monitor Repository test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected MonitorRepository getFixture() {
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
        this.setFixture(MonitorrepositoryFactory.eINSTANCE.createMonitorRepository());
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

} // MonitorRepositoryTest
