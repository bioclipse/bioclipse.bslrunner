package net.bioclipse.bslrunner;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

public class Activator implements BundleActivator {

	private static BundleContext context;

    private static final String EXTENDER_BUNDLE_NAME =
        "org.springframework.bundle.osgi.extender";

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
	    System.out.println("net.bioclipse.bslrunner started");
		Activator.context = bundleContext;
		startBundleExtender();
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

    private void startBundleExtender() {
        List<Bundle> allExtenders =
            Arrays.asList(Platform.getBundles(EXTENDER_BUNDLE_NAME, null));
        if ( allExtenders.size() == 0 ) {
            throw new RuntimeException("found no extender boundle");
        }

        for (Bundle b : allExtenders)
            startTransiently(b);
    }

    private void startTransiently(Bundle b) {
        try {
            b.start(Bundle.START_TRANSIENT);
            System.out.println("Extender boundle started");
        }
        catch (BundleException e) {
            throw new RuntimeException(e);
        }
    }
}