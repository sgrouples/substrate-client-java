package com.strategyobject.substrateclient.rpc.api.weights;

import com.strategyobject.substrateclient.scale.ScaleType;
import com.strategyobject.substrateclient.scale.annotation.Scale;
import com.strategyobject.substrateclient.scale.annotation.ScaleReader;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

/**
 * A bundle of static information collected from the `weight` attributes.
 */
@Getter
@Setter
@ScaleReader
public class DispatchInfo {
    /**
     * Weight of this transaction.
     */
    private Weight weight;

    /**
     * Class of this transaction.
     */
    private DispatchClass dispatchClass;

    /**
     * Does this transaction pay fees.
     */
    private Pays paysFee;
}
