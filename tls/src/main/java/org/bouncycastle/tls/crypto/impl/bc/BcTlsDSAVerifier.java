package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.signers.DSASigner;
import org.bouncycastle.tls.SignatureAlgorithm;

/**
 * Implementation class for the verification of the raw DSA signature type using the BC light-weight API.
 */
public class BcTlsDSAVerifier
    extends BcTlsDSSVerifier
{
    public BcTlsDSAVerifier(BcTlsCrypto crypto, DSAPublicKeyParameters publicKey)
    {
        super(crypto, publicKey);
    }

    protected DSA createDSAImpl()
    {
        return new DSASigner();
    }

    protected short getSignatureAlgorithm()
    {
        return SignatureAlgorithm.dsa;
    }
}
