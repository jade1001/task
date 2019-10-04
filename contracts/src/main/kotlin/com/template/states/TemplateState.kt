package com.template.states

import com.template.contracts.CarContract
import net.corda.core.contracts.BelongsToContract
import net.corda.core.contracts.ContractState
import net.corda.core.identity.AbstractParty

// *********
// * State *
// *********
@BelongsToContract(CarContract::class)
data class TemplateState(val data: String, override val participants: List<AbstractParty> = listOf()) : ContractState
